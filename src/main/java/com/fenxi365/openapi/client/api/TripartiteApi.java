package com.fenxi365.openapi.client.api;

import com.fenxi365.openapi.client.ApiClient;
import com.fenxi365.openapi.client.model.JsonResult;
import com.fenxi365.openapi.client.model.TripartiteDataDto;
import com.fenxi365.openapi.client.model.TripartiteDefinitionDto;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TripartiteApi {

    private final ApiClient client;

    public TripartiteApi(ApiClient client) {
        this.client = client;
    }

    public TripartiteApi withAccountSetId(Long accountSetId) {
        client.withAccountSetId(accountSetId);
        return this;
    }

    public JsonResult<List<TripartiteDefinitionDto>> listDefinitions() {
        Type resultType = new TypeToken<List<TripartiteDefinitionDto>>() {}.getType();
        return client.get("/tripartite/definition/simple", null, resultType);
    }

    public JsonResult<Void> batchPush(String definitionCode, List<TripartiteDataDto> dataList, String batchNo) {
        Map<String, String> params = new HashMap<>();
        params.put("batchNo", batchNo);
        return client.post("/tripartite/data/" + definitionCode + "/batch", dataList, null);
    }

    public JsonResult<Void> batchCancel(String definitionCode, String batchNo) {
        Map<String, String> params = new HashMap<>();
        params.put("batchNo", batchNo);
        return client.delete("/tripartite/data/" + definitionCode + "/batch", params, null);
    }
}
