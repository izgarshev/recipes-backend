package backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication(scanBasePackages = "backend.repos", exclude = {DataSourceAutoConfiguration.class})
public class ServerMain {
    public static void main(String[] args) {
        SpringApplication.run(ServerMain.class, args);
    }
}
