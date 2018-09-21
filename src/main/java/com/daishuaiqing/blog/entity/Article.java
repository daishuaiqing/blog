package com.daishuaiqing.blog.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {

    @Id
    private Integer id;
    private Integer typeId;
    private Integer createTime;
    private String title;
    private String content;
    @JsonIgnore
    private Boolean deleteFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
