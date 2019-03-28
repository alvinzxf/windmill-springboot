package com.example.spring.windmill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.example.spring.windmill.mapper")
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class WindmillApplication {

    public static void main(String[] args) {
        SpringApplication.run(WindmillApplication.class, args);
    }

}
