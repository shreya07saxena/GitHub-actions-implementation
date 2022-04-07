package com.knoldus.codeinsights.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Author {

    private String nickname;
    private String raw;

    public Author(String nickname, String raw) {
        this.nickname = nickname;
        this.raw = raw;
    }



    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }



    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Author(String nickname) {
        this.nickname = nickname;
    }

    public Author() {
    }
}
