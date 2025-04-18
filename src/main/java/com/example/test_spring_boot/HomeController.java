package com.example.test_spring_boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
    @Value("${spring.application.name}")
    private String appName; 

    @Value("${app.message}")
    private String appMessage;
    
    @RequestMapping("/") //för index-hemsidan (start)
    public String home(Model model) {
        System.out.println("appname: " + appName); 
        model.addAttribute("app", new AppMessage(appMessage)); 
        return "index"; 
    }

    //klass för app meddelande
    public static class AppMessage {
        private String message; 

        public AppMessage(String message) {
            this.message = message; 
        }

        public String getMessage() {
            return message; 
        }

        public void setMessage(String message) {
            this.message = message; 
        }
    }

}
