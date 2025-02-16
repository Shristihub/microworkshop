package com.productinfo.service;

import java.util.List;

import com.productinfo.model.Product;

public interface IProductInfoService {
	
	List<Product> getAllProductInfo();
	List<Product> getProductInfoByCategory(String category);
	Product getProductInfoById(int productId);

}
