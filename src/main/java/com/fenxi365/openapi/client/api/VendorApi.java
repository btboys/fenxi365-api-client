package com.fenxi365.openapi.client.api;

import com.fenxi365.openapi.client.ApiClient;
import com.fenxi365.openapi.client.model.JsonResult;
import com.fenxi365.openapi.client.model.PageResult;
import com.fenxi365.openapi.client.model.Vendor;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class VendorApi {

    private final ApiClient client;

    public VendorApi(ApiClient client) {
        this.client = client;
    }

    public VendorApi withAccountSetId(Long accountSetId) {
        client.withAccountSetId(accountSetId);
        return this;
    }

    public JsonResult<PageResult<Vendor>> list(int page, int pageSize) {
        Map<String, String> params = new HashMap<>();
        params.put("page", String.valueOf(page));
        params.put("pageSize", String.valueOf(pageSize));
        Type resultType = new TypeToken<PageResult<Vendor>>() {}.getType();
        return client.get("/vendor", params, resultType);
    }

    public JsonResult<Void> save(Vendor body) {
        return client.post("/vendor", body, null);
    }

    public JsonResult<Void> delete(Long vendorId) {
        return client.delete("/vendor/" + vendorId, (Map<String, String>) null, null);
    }
}
