package com.fenxi365.openapi.client.api;

import com.fenxi365.openapi.client.ApiClient;
import com.fenxi365.openapi.client.model.CurrencyDto;
import com.fenxi365.openapi.client.model.JsonResult;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class CurrencyApi {

    private final ApiClient client;

    public CurrencyApi(ApiClient client) {
        this.client = client;
    }

    public CurrencyApi withAccountSetId(Long accountSetId) {
        client.withAccountSetId(accountSetId);
        return this;
    }

    public JsonResult<List<CurrencyDto>> list() {
        Type resultType = new TypeToken<List<CurrencyDto>>() {}.getType();
        return client.get("/currency", null, resultType);
    }

    public JsonResult<Void> create(CurrencyDto body) {
        return client.post("/currency", body, null);
    }

    public JsonResult<Void> delete(Long currencyId) {
        return client.delete("/currency/" + currencyId, (Map<String, String>) null, null);
    }
}
