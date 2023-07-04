package org.example.config;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.persistence") // 指定Mapper接口所在的包
public class MyBatisPlusConfig {

}