package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
	
	@GetMapping("/hello_world")
 public String HelloWorld() {
	 return "Hello World";
 }
}
