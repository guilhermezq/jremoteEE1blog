package ee.sda.jremoteEE1blog.properties;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "abc")
@Getter
@Setter
//@Data
@NoArgsConstructor
@AllArgsConstructor
@Profile("qa")
public class ApplicationProperties implements ApplicationPropertiesInterf {

    String xyz;
    String wxy;
}
