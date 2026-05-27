package com.fenxi365.openapi.client.api;

import com.fenxi365.openapi.client.ApiClient;
import com.fenxi365.openapi.client.model.Department;
import com.fenxi365.openapi.client.model.JsonResult;
import com.fenxi365.openapi.client.model.PageResult;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class DepartmentApi {

    private final ApiClient client;

    public DepartmentApi(ApiClient client) {
        this.client = client;
    }

    public DepartmentApi withAccountSetId(Long accountSetId) {
        client.withAccountSetId(accountSetId);
        return this;
    }

    public JsonResult<PageResult<Department>> list(int page, int pageSize) {
        Map<String, String> params = new HashMap<>();
        params.put("page", String.valueOf(page));
        params.put("pageSize", String.valueOf(pageSize));
        Type resultType = new TypeToken<PageResult<Department>>() {}.getType();
        return client.get("/department", params, resultType);
    }

    public JsonResult<Void> save(Department body) {
        return client.post("/department", body, null);
    }

    public JsonResult<Void> delete(Long departmentId) {
        return client.delete("/department/" + departmentId, (Map<String, String>) null, null);
    }
}
