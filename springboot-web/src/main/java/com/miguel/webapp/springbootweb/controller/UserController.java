package com.miguel.webapp.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("title", "Hola mundo");
        model.addAttribute("name", "Miguel");
        model.addAttribute("last", "Miguel");
        return "details";
    }
    
}
