package com.UpperFasster.Postman.domain.Controllers.auth;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userLoginController{
    @GetMapping("/login")
    public String showForm(Model model){

        return ("login_form");
    }
}
