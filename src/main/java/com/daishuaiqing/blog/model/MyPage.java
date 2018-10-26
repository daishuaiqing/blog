package com.daishuaiqing.blog.model;

public class MyPage {
    private Integer page = 1;
    private Integer size = 20;

    public Integer getPage() {
        return page - 1;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
