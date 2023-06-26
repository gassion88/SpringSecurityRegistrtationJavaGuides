package com.gassion.springsecurityregistrtationjavaguides.controller;

import com.gassion.springsecurityregistrtationjavaguides.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class AuthController {

    @GetMapping("/index")
    public String home() {
        return "index";
    }

    @GetMapping("/register")
    public String showRegistrationPage(@ModelAttribute("user") UserDTO user) {
        return "register";
    }
}
