package com.productcatalog.util;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.productcatalog.model.Product;

@Component
public class ProductDetails {
	
	public List<Product> showProducts(){
		return Arrays.asList(
				new Product("Mobile",1,"Samsung","Electronics",18000),
				new Product("Laptop",2,"Dell","Electronics",118000),
				new Product("Ball",3,"Nike","Sport",1200),
				new Product("Speaker",4,"Bosh","Electronics",28000),
				new Product("Shoes",5,"Adidas","Sports",18000),
				new Product("Television",6,"Sony","Electronics",298000)
		);
	}
	

}
