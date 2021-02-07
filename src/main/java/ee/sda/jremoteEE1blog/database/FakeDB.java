package ee.sda.jremoteEE1blog.database;

import ee.sda.jremoteEE1blog.models.BlogPost;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FakeDB {

    public List<BlogPost> getAllPosts(){
        List<BlogPost> allPosts = new ArrayList<>();
        allPosts.add(BlogPost.builder().id(1L).title("first post").text("first post").build());
        allPosts.add(BlogPost.builder().id(2L).title("second post").text("second post").build());
        allPosts.add(BlogPost.builder().id(3L).title("third post").text("third post").build());
        return allPosts;
    }

    public BlogPost getPost(Long id) {
        for(BlogPost blogPost: getAllPosts()){
            if(blogPost.getId() == id){
                return blogPost;
            }
        }
        return null;
    }
}
