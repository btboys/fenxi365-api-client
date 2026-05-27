package com.fenxi365.openapi.client.api;

import com.fenxi365.openapi.client.ApiClient;
import com.fenxi365.openapi.client.model.Customer;
import com.fenxi365.openapi.client.model.JsonResult;
import com.fenxi365.openapi.client.model.PageResult;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class CustomerApi {

    private final ApiClient client;

    public CustomerApi(ApiClient client) {
        this.client = client;
    }

    public CustomerApi withAccountSetId(Long accountSetId) {
        client.withAccountSetId(accountSetId);
        return this;
    }

    public JsonResult<PageResult<Customer>> list(int page, int pageSize) {
        Map<String, String> params = new HashMap<>();
        params.put("page", String.valueOf(page));
        params.put("pageSize", String.valueOf(pageSize));
        Type resultType = new TypeToken<PageResult<Customer>>() {}.getType();
        return client.get("/customer", params, resultType);
    }

    public JsonResult<Void> save(Customer body) {
        return client.post("/customer", body, null);
    }

    public JsonResult<Void> delete(Long customerId) {
        return client.delete("/customer/" + customerId, (Map<String, String>) null, null);
    }
}
