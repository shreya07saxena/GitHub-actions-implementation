package com.knoldus.codeinsights.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FInalResponse {
    private Repository repository;
    private Author author;
    private String hash;


    public FInalResponse() {
    }

    public FInalResponse(Repository repository, Author author, String hash) {
        this.repository = repository;
        this.author = author;
        this.hash = hash;
    }

    public Repository getRepository() {
        return repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    @Override
    public String toString() {
        return "FinalResponse{" +
                "repository=" + repository +
                ", author=" + author +
                ", hash='" + hash + '\'' +
                '}';
    }
}
