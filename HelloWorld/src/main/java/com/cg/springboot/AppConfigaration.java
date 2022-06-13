package com.cg.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AppConfigaration {
	@RequestMapping("/hello")
	public  String hello() {
		return "spring boot is worest";
		
	}

}
