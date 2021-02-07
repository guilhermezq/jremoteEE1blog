package ee.sda.jremoteEE1blog.services;


import ee.sda.jremoteEE1blog.models.BlogPost;
import ee.sda.jremoteEE1blog.repositories.BlogPostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogPostService {

    //BlogPostRepository is extended from JPARepository. And so, the bean is
    //created ****** BY SPRING ********
    @Autowired
    private BlogPostRepository repository;

    public List<BlogPost> getAllPosts(){
        return repository.findAll();
    }

    public BlogPost getPost(Long id){
        return repository.findById(id).get();
    }

    public void create(BlogPost blogPost) {
        repository.save(blogPost);
    }
}
