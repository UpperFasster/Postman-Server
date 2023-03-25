package com.UpperFasster.Postman.domain.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "**/templates/index";
    }
}