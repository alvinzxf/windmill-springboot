package com.example.spring.windmill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.example.spring.windmill.mapper")
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan("com.example.spring.windmill.mapper.generator")
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class WindmillApplication {

    public static void main(String[] args) {
        SpringApplication.run(WindmillApplication.class, args);
    }

}
