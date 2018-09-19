package com.daishuaiqing.blog.model;

public class ValidFailResult implements MyResult {
    private String code;
    private Boolean status;
    private String validateMessages;

    public ValidFailResult(String validateMessages){
        this.code = "01";
        this.status = false;
        this.validateMessages = validateMessages;
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

    public String getValidateMessages() {
        return validateMessages;
    }

    public void setValidateMessages(String validateMessages) {
        this.validateMessages = validateMessages;
    }

}
