package com.springboot_sample.springboot_sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String mainPage() {
        return "This is main page";
    }
}
