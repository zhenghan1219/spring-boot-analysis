package com.zzh.springbootmytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication //标记启动类
public class SpringBootMyTestApplication {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();

		SpringApplication.run(SpringBootMyTestApplication.class, args);
	}

}
