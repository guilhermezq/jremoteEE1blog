package ee.sda.jremoteEE1blog.database;

import ee.sda.jremoteEE1blog.models.BlogPost;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FakeDB {
/*
This is just a fake database. It doesnt persist de objects.
 */
    List<BlogPost> allPosts = new ArrayList<>();
    Long idIndex = 0L;

    public List<BlogPost> getAllPosts(){
        return this.allPosts;
    }

    public BlogPost getPost(Long id) {
        for(BlogPost blogPost: getAllPosts()){
            if(blogPost.getId() == id){
                return blogPost;
            }
        }
        return null;
    }

    public void save(BlogPost blogPost) {
        blogPost.setId(idIndex);
        this.allPosts.add(blogPost);
        idIndex++;
    }
}
