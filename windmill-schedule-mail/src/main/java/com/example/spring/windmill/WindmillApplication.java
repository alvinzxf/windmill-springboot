package com.example.spring.windmill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * MapperScan：扫描包及子包下面的mapper
 */
@SpringBootApplication
@EnableScheduling
@MapperScan("com.example.spring.windmill.mapper")
public class WindmillApplication {

    public static void main(String[] args) {
        SpringApplication.run(WindmillApplication.class, args);
    }

}
