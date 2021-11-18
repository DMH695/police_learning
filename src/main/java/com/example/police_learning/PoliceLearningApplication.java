package com.example.police_learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;
@EnableJpaAuditing//利用jpa给数据库的列属性自动赋值（自动创建时间）
@SpringBootApplication
public class PoliceLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoliceLearningApplication.class, args);
    }

}
