package com.phase5.springlogelk.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import com.phase5.springlogelk.SpringLogElkApplication;

@RestController
@RequestMapping("/test")
public class UserController {
    
    Logger logger = LoggerFactory.getLogger(SpringLogElkApplication.class);


    @GetMapping("/hello")
    public String hellopage() {
        logger.info("Hello and welcome to the spring elk project!");
        return "Hello and welcome to the spring elk project!";
    }
    
    @GetMapping("/about")
    public String aboutpage() {
        logger.info("About page");
        return "Hello and welcome to the about page!";
    }
    
    @GetMapping("/signin")
    public String signin() {
        logger.info("Sign in Page");
        return "Hello and welcome to the sign in page!";
    }
    
    @GetMapping("/signout")
    public String signout() {
        logger.info("Sign out Page");
        return "Hello and welcome to the sign out page!";
    }

    
}
