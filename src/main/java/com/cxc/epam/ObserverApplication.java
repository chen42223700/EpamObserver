package com.cxc.epam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ObserverApplication {
    public static void main(String[] args) {
        SpringApplication.run(ObserverApplication.class,args);
    }
}
