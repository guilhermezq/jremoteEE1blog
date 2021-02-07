package ee.sda.jremoteEE1blog.models;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogPost {

    Long id;
    String title;
    String text;
    Date createdAt;
    String author;

}
