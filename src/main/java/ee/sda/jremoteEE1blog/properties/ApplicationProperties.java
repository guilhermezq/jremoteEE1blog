package ee.sda.jremoteEE1blog.properties;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "abc")
@Getter
@Setter
//@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationProperties {

    String xyz;
    String wxy;
}
