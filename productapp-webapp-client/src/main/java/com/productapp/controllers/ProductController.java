package com.productapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.productapp.model.Product;
import com.productapp.service.IProductService;

@Controller
public class ProductController {
	@Autowired
	private IProductService productService;
	
	@GetMapping("/")
	public String getAllProducts(Model model){
		// call the service layer
		List<Product> products = productService.getAll();
		model.addAttribute("products", products);
		return "home";
	}

}











