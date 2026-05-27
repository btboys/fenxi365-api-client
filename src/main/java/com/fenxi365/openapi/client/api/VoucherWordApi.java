package com.fenxi365.openapi.client.api;

import com.fenxi365.openapi.client.ApiClient;
import com.fenxi365.openapi.client.model.JsonResult;
import com.fenxi365.openapi.client.model.VoucherWord;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class VoucherWordApi {

    private final ApiClient client;

    public VoucherWordApi(ApiClient client) {
        this.client = client;
    }

    public VoucherWordApi withAccountSetId(Long accountSetId) {
        client.withAccountSetId(accountSetId);
        return this;
    }

    public JsonResult<List<VoucherWord>> list() {
        Type resultType = new TypeToken<List<VoucherWord>>() {}.getType();
        return client.get("/voucher-word", null, resultType);
    }

    public JsonResult<Void> create(VoucherWord body) {
        return client.post("/voucher-word", body, null);
    }

    public JsonResult<Void> update(VoucherWord body) {
        return client.put("/voucher-word", body, null);
    }

    public JsonResult<Void> delete(Long wordId) {
        return client.delete("/voucher-word/" + wordId, (Map<String, String>) null, null);
    }
}
