package app;
import configuration.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationConfig.class)
public class LPApplication {
        public static void main(String[] args) {
            var ctx = SpringApplication.run(LPApplication.class, args);
            ApplicationConfig config = ctx.getBean(ApplicationConfig.class);
            System.out.println(config);
        }
}

