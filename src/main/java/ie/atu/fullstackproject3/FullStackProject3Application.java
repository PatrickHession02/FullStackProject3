package ie.atu.fullstackproject3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@EnableFeignClients
@SpringBootApplication
public class FullStackProject3Application {

    public static void main(String[] args) {
        SpringApplication.run(FullStackProject3Application.class, args);
    }


}
