package com.fenxi365.openapi.client.api;

import com.fenxi365.openapi.client.ApiClient;
import com.fenxi365.openapi.client.model.JsonResult;
import com.fenxi365.openapi.client.model.PageResult;
import com.fenxi365.openapi.client.model.Stocks;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class StocksApi {

    private final ApiClient client;

    public StocksApi(ApiClient client) {
        this.client = client;
    }

    public StocksApi withAccountSetId(Long accountSetId) {
        client.withAccountSetId(accountSetId);
        return this;
    }

    public JsonResult<PageResult<Stocks>> list(int page, int pageSize) {
        Map<String, String> params = new HashMap<>();
        params.put("page", String.valueOf(page));
        params.put("pageSize", String.valueOf(pageSize));
        Type resultType = new TypeToken<PageResult<Stocks>>() {}.getType();
        return client.get("/stocks", params, resultType);
    }

    public JsonResult<Void> save(Stocks body) {
        return client.post("/stocks", body, null);
    }

    public JsonResult<Void> delete(Long stocksId) {
        return client.delete("/stocks/" + stocksId, (Map<String, String>) null, null);
    }
}
