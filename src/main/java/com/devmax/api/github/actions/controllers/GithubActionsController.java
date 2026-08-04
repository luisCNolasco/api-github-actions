package com.devmax.api.github.actions.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/actions")
public class GithubActionsController {

    @RequestMapping
    public String actions(){
        return "API Spring Boot corriendo desde GitHub Actions \uD83D\uDE80";
    }
}
