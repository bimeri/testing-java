package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.hello.Topic;

import java.util.Arrays;
import java.util.List;
@RestController
public class AppConfiguration {

	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		return Arrays.asList(
				new Topic("1","maths","noelino"),
				new Topic("2","econs","jame"),
				new Topic("3", "chemistry" ,"peggy"),
				new Topic("4","english","glory")
				);
		}
}
