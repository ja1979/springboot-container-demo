package ec.sevolutivo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationProperties.class)
@RestController
public class DemoApplication {

    private final ApplicationProperties prop;

    public DemoApplication(ApplicationProperties prop) {
        this.prop = prop;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @RequestMapping("/api")
    public String home() {
        return "Calling service: " + prop.getServiceUrl();
    }

}
