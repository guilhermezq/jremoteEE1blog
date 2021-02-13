package ee.sda.jremoteEE1blog.controllers;

import ee.sda.jremoteEE1blog.services.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    BlogPostService service;

    @GetMapping("/home")
    String getHome(){
        service.getAllPosts();
        return "homepage";
    }

}
