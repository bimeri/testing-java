package com.example.demo;

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

import com.example.demo.ItemController;

@RunWith(SpringRunner.class)
@WebMvcTest(ItemController.class)

public class ItemControllerTest {
	@Autowired
private MockMvc mockMvc;

	@Test
	public void TestItems() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders.get("/all_items")
								.accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(request)
							.andExpect(status().isOk())
							.andExpect(content().string("{\"id\":1,\"name\":\"Noel\",\"price\":200,\"quantity\":3}"))
							.andReturn();
	}
}
