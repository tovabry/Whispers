package org.example.springbooty.web.controller;

import org.example.springbooty.domain.AppUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class AppUserController {

    private final AppUserService appUserService;

    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping("/view")
    public String viewUsers(Model model) {
        model.addAttribute("users", appUserService.getAllUsers());
        return "view-users";
    }

}
