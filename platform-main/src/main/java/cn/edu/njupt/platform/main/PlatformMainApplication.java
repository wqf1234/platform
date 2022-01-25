package cn.edu.njupt.platform.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "cn.edu.njupt.platform")
public class PlatformMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformMainApplication.class, args);
    }

}
