package com.galaxy.FindMyProduct.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindMyProductController {
	
	@GetMapping("/products")
	public String GetAllProducts() {
		return "List of Products";
	}
	@GetMapping("/")
	public String HelloUser() {
		return "Hello User";
	}
}
