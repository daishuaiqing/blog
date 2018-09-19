package com.daishuaiqing.blog.model;

public class ExceptionResult implements MyResult {
    private String code;
    private Boolean status;
    private String msg;

    public ExceptionResult(String msg){
        this.code = "50";
        this.status = false;
        this.msg = msg;
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
        return msg;
    }

    public void setData(String msg) {
        this.msg = msg;
    }
}
