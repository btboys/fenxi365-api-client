package com.fenxi365.openapi.client.api;

import com.fenxi365.openapi.client.ApiClient;
import com.fenxi365.openapi.client.model.JsonResult;
import com.fenxi365.openapi.client.model.PageResult;
import com.fenxi365.openapi.client.model.VoucherDto;
import com.fenxi365.openapi.client.model.VoucherQuery;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class VoucherApi {

    private final ApiClient client;

    public VoucherApi(ApiClient client) {
        this.client = client;
    }

    public VoucherApi withAccountSetId(Long accountSetId) {
        client.withAccountSetId(accountSetId);
        return this;
    }

    public JsonResult<PageResult<VoucherDto>> list(VoucherQuery query) {
        Type resultType = new TypeToken<PageResult<VoucherDto>>() {
        }.getType();
        return client.post("/voucher/list", query, resultType);
    }

    public JsonResult<VoucherDto> getById(Long voucherId) {
        return client.get("/voucher/" + voucherId, null, VoucherDto.class);
    }

    public JsonResult<VoucherDto> create(VoucherDto body) {
        return client.post("/voucher", body, VoucherDto.class);
    }

    public JsonResult<VoucherDto> update(VoucherDto body) {
        return client.put("/voucher", body, VoucherDto.class);
    }

    public JsonResult<Void> delete(List<VoucherDto> voucherList) {
        return client.post("/voucher/delete", voucherList, null);
    }
}
