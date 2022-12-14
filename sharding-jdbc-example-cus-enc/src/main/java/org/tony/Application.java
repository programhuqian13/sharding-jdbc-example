package org.tony;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Tony
 */
@SpringBootApplication
@MapperScan(basePackages = "org.tony.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
