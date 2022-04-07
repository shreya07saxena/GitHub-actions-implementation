package com.knoldus.codeinsights.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Repository {

    private String fullName;

    public Repository(String full_name) {
        this.fullName = full_name;
    }

    private String type;
    private String name;
    private String uuid;

    public String getFull_name() {
        return fullName;
    }

    public void setFull_name(String full_name) {
        this.fullName = full_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Repository(String full_name, String type, String name, String uuid) {
        this.fullName = full_name;
        this.type = type;
        this.name = name;
        this.uuid = uuid;
    }

    public Repository() {
    }

    @Override
    public String toString() {
        return "Repository{" +
                "full_name='" + fullName + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }



}