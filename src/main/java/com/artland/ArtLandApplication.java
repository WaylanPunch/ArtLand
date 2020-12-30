package com.artland;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 13
 * @qq交流群 796794009
 * @email 2449207463@qq.com
 * @link http://13blog.site
 */
@MapperScan("com.artland.dao")
@SpringBootApplication
public class ArtLandApplication {
    public static void main(String[] args) {
        SpringApplication.run(ArtLandApplication.class, args);
    }
}
