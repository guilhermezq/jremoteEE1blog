package ee.sda.jremoteEE1blog.controllers;

import ee.sda.jremoteEE1blog.models.BlogPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

    @GetMapping("/posts/all")
    String getAllPosts(){
        return "posts";
    }


}
