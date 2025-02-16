package com.productinfo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.productinfo.model.Inventory;
import com.productinfo.model.Product;
@Service
public class ProductInfoServiceImpl implements IProductInfoService {

	// from here call the catalog service
	// call the microservice synchronously using RestTemplate
	@Autowired
	RestTemplate restTemplate;
	// pass the application
	String BASEURL= "http://PRODUCT-CATALOG/catalog-service/v1/productcatalog";
	String INURL = "http://PRODUCT-INVENTORY/inventory-service/v1/productinventory";
	@Override
	public List<Product> getAllProductInfo() {
//		Product[] products =  restTemplate.getForObject(BASEURL, Product[].class);
//		Inventory[] inventory =  restTemplate.getForObject(INURL, Inventory[].class);
//		List<Product> productList = new ArrayList<>();  
//		for (Inventory inventory2 : inventory) {
//			for (Product product : products) {
//				if(product.getProductId()==inventory2.getProductId())
//					product.setStock(inventory2.getQuantity());
//				productList.add(product);
//			}
//		}
//		return productList;
		return  restTemplate.getForObject(BASEURL, List.class);
	}

	@Override
	public List<Product> getProductInfoByCategory(String category) {
//		http://localhost:8081/catalog-service/v1/productcatalog/category/Sports
		String url = BASEURL.concat("/category/").concat(category);
		return  restTemplate.getForObject(url, List.class);
	}

	@Override
	public Product getProductInfoById(int prodId) {
//		http://localhost:8081/catalog-service/v1/productcatalog/productId/1";
		String url = BASEURL.concat("/productId/")+prodId;
		return restTemplate.getForObject(url, Product.class);
	}

}







