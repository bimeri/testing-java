package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Item;

@RestController
public class ItemController {
	DataService dataSevice;
	
	@GetMapping("/all_items")
	public Item itemsMethod() {
		Item myItem = new Item(1, "Noel", 200, 3);
		return myItem;
	}
	
//	@GetMapping("items_service")
//	public Items getFromservice() {
//		
//	}
}
