package com.fenxi365.openapi.client.model;

public class JsonResult<T> {

    private boolean success = true;
    private Integer code = 200;
    private String msg = "";
    private T data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isFailed() {
        return !success;
    }

    @Override
    public String toString() {
        return "JsonResult{success=" + success + ", code=" + code + ", msg='" + msg + "', data=" + data + "}";
    }
}
