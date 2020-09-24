package com.intest.systemservice.response;


import java.util.List;

public class SystemMenuResponse {
    private String key;
    private String title;
    private List<SystemMenuResponse> Children;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SystemMenuResponse> getChildren() {
        return Children;
    }

    public void setChildren(List<SystemMenuResponse> children) {
        Children = children;
    }
}
