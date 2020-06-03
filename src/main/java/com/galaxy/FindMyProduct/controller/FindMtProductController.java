package com.galaxy.FindMyProduct.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindMtProductController {
	
	@GetMapping("/products")
	public String GetAllProducts() {
		return "List of Products";
	}
}
