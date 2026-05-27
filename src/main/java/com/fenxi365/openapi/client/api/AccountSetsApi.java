package com.fenxi365.openapi.client.api;

import com.fenxi365.openapi.client.ApiClient;
import com.fenxi365.openapi.client.model.AccountSetsDto;
import com.fenxi365.openapi.client.model.JsonResult;
import com.fenxi365.openapi.client.model.PageResult;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class AccountSetsApi {

    private final ApiClient client;

    public AccountSetsApi(ApiClient client) {
        this.client = client;
    }

    public AccountSetsApi withAccountSetId(Long accountSetId) {
        client.withAccountSetId(accountSetId);
        return this;
    }

    public JsonResult<PageResult<AccountSetsDto>> list(String companyName, int page, int pageSize, Boolean showStop) {
        Map<String, String> params = new HashMap<>();
        params.put("companyName", companyName);
        params.put("page", String.valueOf(page));
        params.put("pageSize", String.valueOf(pageSize));
        if (showStop != null) params.put("showStop", showStop.toString());
        Type resultType = new TypeToken<PageResult<AccountSetsDto>>() {}.getType();
        return client.get("/account-sets", params, resultType);
    }

    public JsonResult<AccountSetsDto> create(AccountSetsDto body) {
        return client.post("/account-sets", body, AccountSetsDto.class);
    }
}
