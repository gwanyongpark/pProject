package com.example.b4;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.b4.mappers")
public class B4Application {

	public static void main(String[] args) {
		SpringApplication.run(B4Application.class, args);
	}

}
