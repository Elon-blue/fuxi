package com.elon.democlientconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class DemoClientConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoClientConsumerApplication.class, args);
    }

}
