package org.example.springbooty.web.controller;

import org.example.springbooty.domain.AppUserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class WebController {

    AppUserService appUserService;
    public WebController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping("/hello")
    String hello(Model model) {
        model.addAttribute("message", "Hello World!");
        model.addAttribute("name", "Bitch face");
        return "hello";
    }

}
