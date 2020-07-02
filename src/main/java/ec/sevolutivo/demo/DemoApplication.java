package ec.sevolutivo.demo;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;


@SpringBootApplication
@RestController
public class DemoApplication {

    @Value("${application.serviceUrl}")
    private String serviceUrl;

    public DemoApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("/api")
    public String home() {
        return "Calling service: " + this.serviceUrl;
    }

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "Hello " + name;
    }

}
