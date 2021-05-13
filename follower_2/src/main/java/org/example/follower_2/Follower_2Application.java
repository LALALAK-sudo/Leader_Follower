package org.example.follower_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = {"org.example.follower_2.dao"})
public class Follower_2Application {
    public static void main(String[] args) {
        SpringApplication.run(Follower_2Application.class,args);
    }
}
