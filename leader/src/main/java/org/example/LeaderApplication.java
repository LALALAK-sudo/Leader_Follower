package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = {"org.example.leader.dao"})
public class LeaderApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeaderApplication.class,args);
    }
}
