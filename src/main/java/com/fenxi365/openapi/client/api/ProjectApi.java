package com.fenxi365.openapi.client.api;

import com.fenxi365.openapi.client.ApiClient;
import com.fenxi365.openapi.client.model.JsonResult;
import com.fenxi365.openapi.client.model.PageResult;
import com.fenxi365.openapi.client.model.Project;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class ProjectApi {

    private final ApiClient client;

    public ProjectApi(ApiClient client) {
        this.client = client;
    }

    public ProjectApi withAccountSetId(Long accountSetId) {
        client.withAccountSetId(accountSetId);
        return this;
    }

    public JsonResult<PageResult<Project>> list(int page, int pageSize) {
        Map<String, String> params = new HashMap<>();
        params.put("page", String.valueOf(page));
        params.put("pageSize", String.valueOf(pageSize));
        Type resultType = new TypeToken<PageResult<Project>>() {}.getType();
        return client.get("/project", params, resultType);
    }

    public JsonResult<Void> save(Project body) {
        return client.post("/project", body, null);
    }

    public JsonResult<Void> delete(Long projectId) {
        return client.delete("/project/" + projectId, (Map<String, String>) null, null);
    }
}
