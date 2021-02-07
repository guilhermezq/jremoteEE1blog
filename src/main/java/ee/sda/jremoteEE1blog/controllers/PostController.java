package ee.sda.jremoteEE1blog.controllers;

import ee.sda.jremoteEE1blog.models.BlogPost;
import ee.sda.jremoteEE1blog.services.BlogPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class PostController {

    final private BlogPostService service;

    //Get Only all posts
    @GetMapping("/posts/all")
    ModelAndView getAllPosts(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("posts");
        modelAndView.addObject("title", "All Posts: ");
        List<BlogPost> posts = service.getAllPosts();
        modelAndView.addObject("posts", posts);
        return modelAndView;
    }

    //Get Only one post
    @GetMapping("/posts/{id}")
    ModelAndView getPost(@PathVariable("id") Long postId){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("post");
        modelAndView.addObject("title", "Posts: ");
        BlogPost post = service.getPost(postId);
        modelAndView.addObject("post", post);
        return modelAndView;
    }




}
