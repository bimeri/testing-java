package com.example.holloworld.test;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.HelloworldController;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloworldController.class)
public class HelloWorldControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void hell_worl_basic() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders
									.get("/helo_world")
									.accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(request)
									.andExpect(status().isOk())
									.andExpect(content().string("Hello world"))
									.andReturn();
		assertEquals("Hello world", result.getResponse().getContentAsString());
	}
}
