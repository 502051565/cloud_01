package com.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    //https://www.cnblogs.com/kansong/p/12000155.html

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

}
