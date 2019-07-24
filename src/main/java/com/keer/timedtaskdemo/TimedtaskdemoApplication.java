package com.keer.timedtaskdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TimedtaskdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimedtaskdemoApplication.class, args);
    }

}
