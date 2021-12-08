package com.queiroz.ENews.entities;

import java.io.Serializable;

public class UriDTO implements Serializable {

    private String url;

    public UriDTO() {
    }

    public UriDTO(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
