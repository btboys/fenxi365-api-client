package com.fenxi365.openapi.client.api;

import com.fenxi365.openapi.client.ApiClient;
import com.fenxi365.openapi.client.model.AccountingCategory;
import com.fenxi365.openapi.client.model.JsonResult;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class AccountingCategoryApi {

    private final ApiClient client;

    public AccountingCategoryApi(ApiClient client) {
        this.client = client;
    }

    public AccountingCategoryApi withAccountSetId(Long accountSetId) {
        client.withAccountSetId(accountSetId);
        return this;
    }

    public JsonResult<List<AccountingCategory>> list() {
        Type resultType = new TypeToken<List<AccountingCategory>>() {}.getType();
        return client.get("/accounting-category", null, resultType);
    }

    public JsonResult<Void> create(AccountingCategory body) {
        return client.post("/accounting-category", body, null);
    }

    public JsonResult<Void> update(AccountingCategory body) {
        return client.put("/accounting-category", body, null);
    }

    public JsonResult<Void> delete(Long categoryId) {
        return client.delete("/accounting-category/" + categoryId, (Map<String, String>) null, null);
    }
}
