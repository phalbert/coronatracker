package com.appcellon.coronatracker.controllers;

import com.appcellon.coronatracker.services.DataService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("allStats", DataService.getAllStats());
        return "home";
    }

}
