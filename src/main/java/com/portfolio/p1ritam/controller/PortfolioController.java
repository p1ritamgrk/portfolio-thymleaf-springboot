package com.portfolio.p1ritam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @GetMapping()
    public String  getHomePage() {
        return "index";
    }
}
