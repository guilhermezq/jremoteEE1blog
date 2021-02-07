package ee.sda.jremoteEE1blog.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
public class BlogPost {

    Long id;
    String title;
    String text;
    Date createdAt;
    String author;

}
