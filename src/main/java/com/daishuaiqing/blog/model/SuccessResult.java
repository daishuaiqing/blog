package com.daishuaiqing.blog.model;

public class SuccessResult implements MyResult{
    private String code;
    private Boolean status;
    private Object data;

    public SuccessResult(Object data){
        this.code = "00";
        this.status = true;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
