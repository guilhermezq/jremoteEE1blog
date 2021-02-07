package ee.sda.jremoteEE1blog.repositories;

import ee.sda.jremoteEE1blog.models.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
}
