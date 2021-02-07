package ee.sda.jremoteEE1blog.services;

import ee.sda.jremoteEE1blog.database.FakeDB;
import ee.sda.jremoteEE1blog.models.BlogPost;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlogPostService {

    final private FakeDB fakeDB;

    public List<BlogPost> getAllPosts(){
        return fakeDB.getAllPosts();
    }

    public BlogPost getPost(Long id){
        return fakeDB.getPost(id);
    }
}
