package com.fenxi365.openapi.client;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.fenxi365.openapi.client.model.JsonResult;
import okhttp3.*;

import java.io.IOException;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class ApiClient {

    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    private static final String HEADER_API_KEY = "F-API-KEY";
    private static final String HEADER_ACCOUNT_SET_ID = "accountSetId";

    private final OkHttpClient httpClient;
    private final Gson gson;
    private final String baseUrl;
    private final String pathPrefix;
    private final ThreadLocal<Long> pendingHolder = new ThreadLocal<>();
    private final ThreadLocal<Long> persistentHolder = new ThreadLocal<>();

    ApiClient(String baseUrl, String apiKey) {
        this(baseUrl, apiKey, "/api", 30, 30);
    }

    ApiClient(String baseUrl, String apiKey, String pathPrefix) {
        this(baseUrl, apiKey, pathPrefix, 30, 30);
    }

    ApiClient(String baseUrl, String apiKey, String pathPrefix, long connectTimeout, long readTimeout) {
        this.baseUrl = normalizeBaseUrl(baseUrl);
        this.pathPrefix = normalizePrefix(pathPrefix);
        this.httpClient = new OkHttpClient.Builder()
                .connectTimeout(connectTimeout, TimeUnit.SECONDS)
                .readTimeout(readTimeout, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(chain -> {
                    Request request = chain.request().newBuilder()
                            .header(HEADER_API_KEY, apiKey)
                            .header("Content-Type", "application/json")
                            .header("Accept", "application/json")
                            .build();
                    return chain.proceed(request);
                })
                .build();
        this.gson = new GsonBuilder()
                .registerTypeAdapter(LocalDate.class, (JsonSerializer<LocalDate>) (src, type, ctx) ->
                        src == null ? JsonNull.INSTANCE : new JsonPrimitive(src.format(DateTimeFormatter.ISO_LOCAL_DATE)))
                .registerTypeAdapter(LocalDate.class, (JsonDeserializer<LocalDate>) (json, type, ctx) ->
                        json.isJsonNull() ? null : LocalDate.parse(json.getAsString()))
                .registerTypeAdapter(LocalDateTime.class, (JsonSerializer<LocalDateTime>) (src, type, ctx) ->
                        src == null ? JsonNull.INSTANCE : new JsonPrimitive(src.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)))
                .registerTypeAdapter(LocalDateTime.class, (JsonDeserializer<LocalDateTime>) (json, type, ctx) ->
                        json.isJsonNull() ? null : LocalDateTime.parse(json.getAsString(), DateTimeFormatter.ISO_LOCAL_DATE_TIME))
                .setDateFormat("yyyy-MM-dd HH:mm:ss")
                .create();
    }

    public void withAccountSetId(Long accountSetId) {
        if (accountSetId != null) {
            pendingHolder.set(accountSetId);
        }
    }

    public void setAccountSetId(Long accountSetId) {
        if (accountSetId != null) {
            persistentHolder.set(accountSetId);
        } else {
            persistentHolder.remove();
        }
    }

    public void clearAccountSetId() {
        persistentHolder.remove();
    }

    private void applyAccountSetId(Request.Builder builder) {
        Long id = pendingHolder.get();
        if (id != null) {
            builder.addHeader(HEADER_ACCOUNT_SET_ID, id.toString());
            return;
        }
        id = persistentHolder.get();
        if (id != null) {
            builder.addHeader(HEADER_ACCOUNT_SET_ID, id.toString());
        }
    }

    private static String normalizeBaseUrl(String url) {
        if (url == null || url.isEmpty()) {
            throw new IllegalArgumentException("baseUrl must not be empty");
        }
        String normalized = url;
        if (normalized.endsWith("/")) {
            normalized = normalized.substring(0, normalized.length() - 1);
        }
        return normalized;
    }

    private static String normalizePrefix(String prefix) {
        if (prefix == null || prefix.isEmpty()) {
            return "";
        }
        String p = prefix.startsWith("/") ? prefix : "/" + prefix;
        if (p.endsWith("/")) {
            p = p.substring(0, p.length() - 1);
        }
        return p;
    }

    private String buildPath(String path) {
        if (path == null || path.isEmpty()) {
            return pathPrefix;
        }
        String p = path.startsWith("/") ? path : "/" + path;
        return pathPrefix + p;
    }

    private <T> JsonResult<T> send(Request request, Type resultType) {
        try {
            return execute(request, resultType);
        } finally {
            pendingHolder.remove();
        }
    }

    public <T> JsonResult<T> get(String path, Map<String, String> queryParams, Type resultType) {
        HttpUrl.Builder urlBuilder = Objects.requireNonNull(HttpUrl.parse(baseUrl + buildPath(path))).newBuilder();
        if (queryParams != null) {
            queryParams.forEach((key, value) -> {
                if (value != null && !value.isEmpty()) {
                    urlBuilder.addQueryParameter(key, value);
                }
            });
        }
        Request.Builder builder = new Request.Builder()
                .url(urlBuilder.build())
                .get();
        applyAccountSetId(builder);
        return send(builder.build(), resultType);
    }

    public <T> JsonResult<T> post(String path, Object body, Type resultType) {
        Request.Builder builder = new Request.Builder().url(baseUrl + buildPath(path));
        if (body != null) {
            builder.post(RequestBody.create(gson.toJson(body), JSON));
        } else {
            builder.post(RequestBody.create("", JSON));
        }
        applyAccountSetId(builder);
        return send(builder.build(), resultType);
    }

    public <T> JsonResult<T> put(String path, Object body, Type resultType) {
        Request.Builder builder = new Request.Builder().url(baseUrl + buildPath(path));
        if (body != null) {
            builder.put(RequestBody.create(gson.toJson(body), JSON));
        } else {
            builder.put(RequestBody.create("", JSON));
        }
        applyAccountSetId(builder);
        return send(builder.build(), resultType);
    }

    public <T> JsonResult<T> delete(String path, Map<String, String> queryParams, Type resultType) {
        HttpUrl.Builder urlBuilder = Objects.requireNonNull(HttpUrl.parse(baseUrl + buildPath(path))).newBuilder();
        if (queryParams != null) {
            queryParams.forEach((key, value) -> {
                if (value != null && !value.isEmpty()) {
                    urlBuilder.addQueryParameter(key, value);
                }
            });
        }
        Request.Builder builder = new Request.Builder()
                .url(urlBuilder.build())
                .delete();
        applyAccountSetId(builder);
        return send(builder.build(), resultType);
    }

    public <T> JsonResult<T> delete(String path, Object body, Type resultType) {
        Request.Builder builder = new Request.Builder().url(baseUrl + buildPath(path));
        if (body != null) {
            builder.delete(RequestBody.create(gson.toJson(body), JSON));
        } else {
            builder.delete(RequestBody.create("", JSON));
        }
        applyAccountSetId(builder);
        return send(builder.build(), resultType);
    }

    @SuppressWarnings("unchecked")
    private <T> JsonResult<T> execute(Request request, Type resultType) {
        try (Response response = httpClient.newCall(request).execute()) {
            String responseBody = response.body() != null ? response.body().string() : "";
            if (!response.isSuccessful()) {
                throw new ApiException(response.code(), "HTTP " + response.code() + ": " + response.message());
            }
            JsonResult<T> result = gson.fromJson(responseBody, new TypeToken<JsonResult<T>>(){}.getType());
            if (result.getData() != null && resultType != null) {
                JsonElement element = gson.fromJson(responseBody, JsonElement.class);
                JsonElement dataElement = element.getAsJsonObject().get("data");
                if (dataElement != null && !dataElement.isJsonNull()) {
                    T data = gson.fromJson(dataElement, resultType);
                    result.setData(data);
                }
            }
            return result;
        } catch (JsonSyntaxException e) {
            throw new ApiException(500, "Failed to parse response: " + e.getMessage());
        } catch (IOException e) {
            throw new ApiException(0, "Network error: " + e.getMessage());
        }
    }

    Gson getGson() {
        return gson;
    }
}
