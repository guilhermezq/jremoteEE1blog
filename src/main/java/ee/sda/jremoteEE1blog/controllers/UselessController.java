package ee.sda.jremoteEE1blog.controllers;

import ee.sda.jremoteEE1blog.services.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UselessController {

    @Autowired
    BlogPostService service;

    @GetMapping("/useless")
    String useless(){
        service.getAllPosts();
        return "useless";
    }
}
