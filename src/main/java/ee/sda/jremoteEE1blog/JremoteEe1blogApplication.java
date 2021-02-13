package ee.sda.jremoteEE1blog;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
public class JremoteEe1blogApplication {

	public static void main(String[] args) {
		SpringApplication.run(JremoteEe1blogApplication.class, args);
	}

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	ModelAndView modelAndView(){
		return new ModelAndView();
	}
}
