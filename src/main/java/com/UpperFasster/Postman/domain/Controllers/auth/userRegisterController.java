package com.UpperFasster.Postman.domain.Controllers.auth;

import com.UpperFasster.Postman.domain.dao.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class userRegisterController {

    @GetMapping("/register")
    public String showForm(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "register_form";
    }

    @PostMapping("/register")
    public String sumbitForm(@ModelAttribute("user") User user){
        System.out.println(user);
        return "register_success";
    }
}

