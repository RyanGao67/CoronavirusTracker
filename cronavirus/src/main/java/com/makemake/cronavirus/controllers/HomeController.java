package com.makemake.cronavirus.controllers;

import com.makemake.cronavirus.service.CoronavirusTracker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    CoronavirusTracker coronavirustracker;
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("locationStats", coronavirustracker.getAllStats());
        return "home";
    }
}
