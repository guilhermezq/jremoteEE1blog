package ee.sda.jremoteEE1blog.controllers;

import ee.sda.jremoteEE1blog.models.BlogPost;
import ee.sda.jremoteEE1blog.properties.ApplicationProperties;
import ee.sda.jremoteEE1blog.properties.ApplicationPropertiesInterf;
import ee.sda.jremoteEE1blog.services.BlogPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/posts")
public class PostController {


    final private ApplicationPropertiesInterf applicationName;
    final private BlogPostService service;

    @Autowired
    ModelAndView modelAndView;

    //Get Only all posts
    @GetMapping("/all")
    ModelAndView getAllPosts(Model model){
        modelAndView.setViewName("posts");
        modelAndView.addObject("title", applicationName.getWxy());
        // this is how we change the title of our page using properties
        //modelAndView.addObject("title", applicationName.getXyz());
        List<BlogPost> posts = service.getAllPosts();
        modelAndView.addObject("posts", posts);
        return modelAndView;
    }

    //Get Only one post
    @GetMapping("/{id}")
    ModelAndView getPost(@PathVariable("id") Long postId){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("post");
        modelAndView.addObject("title", "Posts: ");
        BlogPost post = service.getPost(postId);
        modelAndView.addObject("post", post);
        return modelAndView;
    }

    @GetMapping("/create")
    String createPost(Model model){
        model.addAttribute("blogPost", new BlogPost());
        return "createpost";
    }

    @PostMapping("/create")
    RedirectView create(@ModelAttribute BlogPost blogPost){
        service.create(blogPost);
        return new RedirectView("/posts/all");
    }



}
