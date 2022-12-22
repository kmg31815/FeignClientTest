package com.kmg.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kmg.demo.dto.JwtKey;
import com.kmg.demo.feign.ExampleFeignClient;

@RestController
public class TestController {

	@Autowired
	private ExampleFeignClient feignClient;

	@PostMapping("/test/{consumer}")
	public JwtKey getJwtKey(@PathVariable String consumer) {
		return feignClient.getJwtKey(consumer);
	}

}
