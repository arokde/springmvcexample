package com.pluralsight.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("greeting")
    public String greeting(Map<String,Object> model ) {
        model.put("message","Hello Spring MVC1 Greeting");
        return "greeting";
    }

    @GetMapping("thyme")
    public String thyme(Map<String,Object> model ) {
        model.put("message","Hello thyme leaf");
        return "thyme";
    }
}
