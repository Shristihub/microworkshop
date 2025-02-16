package com.productinfo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productinfo.model.Product;
import com.productinfo.service.IProductInfoService;

//@RestController
@RequestMapping("/infostock-service/v1")
public class ProductInfoStockController {
	
	@Autowired
	private IProductInfoService infoService;
	
//	http://localhost:8082/info-service/v1/productinfo
	@GetMapping("/productstock")
	List<Product> viewInfo(){
		return infoService.getAllProductInfo();
		
	}
//	http://localhost:8082/info-service/v1/productinfo/category/Sports
	@GetMapping("/productinfo/category/{category}")
	List<Product> viewInfoByCategory(@PathVariable String category){
		return infoService.getProductInfoByCategory(category);
		
	}
//	http://localhost:8082/info-service/v1/productinfo/productId/1
	@GetMapping("/productinfo/productId/{productId}")
	Product viewInfoById(@PathVariable int productId) {
		return infoService.getProductInfoById(productId);
		
	}


}






