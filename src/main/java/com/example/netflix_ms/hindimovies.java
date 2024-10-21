package com.example.netflix_ms;

import org.springframework.web.bind.annotation.GetMapping;

public class hindimovies {
    @GetMapping("/hindimovies")
    public String getData() {
        return "Please book Hindimovies From Cloudhaze and songs we are offering more exciting offers , we will provide you 60% discount on this";
    }
}

