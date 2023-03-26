package com.UpperFasster.Postman.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping(path = "/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public List<User> userList(){
        return userService.getUsers();
    }

/*
    @GetMapping("/register")
    @ModelAttribute()
    public String showForm(Model model){
        model.addAttribute("user", new User());
        return "register_form";
    }

    @PostMapping("/register")
    public String sumbitForm(@RequestBody User user){
        userService.addNewUser(user);
        return "register_success";
    }
 */
}
