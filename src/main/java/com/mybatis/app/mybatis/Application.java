package com.mybatis.app.mybatis;

import org.apache.ibatis.type.MappedTypes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.mybatis.app"})  
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
