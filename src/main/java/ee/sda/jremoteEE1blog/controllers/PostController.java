package ee.sda.jremoteEE1blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

    @GetMapping("/posts")
    String getAllPosts(){
        return "posts";
    }
}
