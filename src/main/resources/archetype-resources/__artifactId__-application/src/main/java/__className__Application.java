package ${package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "${package}" })
public class ${className}Application {

    public static void main(String[] args) {
        SpringApplication.run(${className}Application.class, args);
    }

}