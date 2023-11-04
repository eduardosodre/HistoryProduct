package br.com.school.history.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.school.history")
public class Application {

    public static void main(String[] args) {
        var app = new SpringApplication(Application.class);
        app.run(args);
    }
}
