package com.fenxi365.openapi.client.api;

import com.fenxi365.openapi.client.ApiClient;
import com.fenxi365.openapi.client.model.JsonResult;
import com.fenxi365.openapi.client.model.Subject;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubjectApi {

    private final ApiClient client;

    public SubjectApi(ApiClient client) {
        this.client = client;
    }

    public SubjectApi withAccountSetId(Long accountSetId) {
        client.withAccountSetId(accountSetId);
        return this;
    }

    public JsonResult<List<Subject>> list(String type) {
        Map<String, String> params = new HashMap<>();
        if (type != null) params.put("type", type);
        Type resultType = new TypeToken<List<Subject>>() {}.getType();
        return client.get("/subject", params, resultType);
    }

    public JsonResult<List<Subject>> voucherSelect(Boolean showAll) {
        Map<String, String> params = new HashMap<>();
        if (showAll != null) params.put("showAll", showAll.toString());
        Type resultType = new TypeToken<List<Subject>>() {}.getType();
        return client.get("/subject/voucher/select", params, resultType);
    }
}
