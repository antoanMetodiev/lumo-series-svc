package com.example.streammateseriessvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class StreamMateSeriesSvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamMateSeriesSvcApplication.class, args);
    }
}
