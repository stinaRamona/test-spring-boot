package com.example.test_spring_boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
    @RequestMapping("/") //för index-hemsidan (start)
    public String home() {
        return "index.html"; 
    }
}
