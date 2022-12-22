package com.kmg.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.kmg.demo.feign") // 開啟 Feign
public class FeignClientTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientTestApplication.class, args);
	}

}
