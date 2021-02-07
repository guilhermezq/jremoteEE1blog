package ee.sda.jremoteEE1blog.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
public class BlogPost {

    @GeneratedValue
    @Id
    Long id;
    String title;
    String text;
    Date createdAt;
    String author;

}
