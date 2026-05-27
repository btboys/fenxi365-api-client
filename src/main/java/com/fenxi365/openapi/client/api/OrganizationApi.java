package com.fenxi365.openapi.client.api;

import com.fenxi365.openapi.client.ApiClient;
import com.fenxi365.openapi.client.model.JsonResult;
import com.fenxi365.openapi.client.model.Organization;
import com.fenxi365.openapi.client.model.PageResult;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class OrganizationApi {

    private final ApiClient client;

    public OrganizationApi(ApiClient client) {
        this.client = client;
    }

    public OrganizationApi withAccountSetId(Long accountSetId) {
        client.withAccountSetId(accountSetId);
        return this;
    }

    public JsonResult<PageResult<Organization>> list(int page, int pageSize) {
        Map<String, String> params = new HashMap<>();
        params.put("page", String.valueOf(page));
        params.put("pageSize", String.valueOf(pageSize));
        Type resultType = new TypeToken<PageResult<Organization>>() {
        }.getType();
        return client.get("/organization", params, resultType);
    }

    public JsonResult<Void> save(Organization body) {
        return client.post("/organization", body, null);
    }

    public JsonResult<Void> delete(Long organizationId) {
        return client.delete("/organization/" + organizationId, null, null);
    }
}
