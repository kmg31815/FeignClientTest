package com.kmg.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kmg.demo.dto.JwtKey;

@Component
@FeignClient("http://localhost:8001/")
public interface ExampleFeignClient {

	@PostMapping("/consumers/{consumer}/jwt")
	public JwtKey getJwtKey(@PathVariable String consumer);

}
