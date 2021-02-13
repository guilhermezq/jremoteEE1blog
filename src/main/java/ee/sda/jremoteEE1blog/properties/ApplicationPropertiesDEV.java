package ee.sda.jremoteEE1blog.properties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
//@Data
@NoArgsConstructor
@AllArgsConstructor
@Profile("dev")
public class ApplicationPropertiesDEV implements ApplicationPropertiesInterf{


    String xyz = "this is dev";
    String wxy = "this is dev";
}
