package org.example.follower_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = {"org.example.follower_1.dao"})
public class Follower_1Application {
    public static void main(String[] args) {
        SpringApplication.run(Follower_1Application.class,args);
    }
}
