package com.web.electriohubbackend.dao;

import java.util.List;

import com.web.electriohubbackend.dto.Product;

public interface ProductDao {

	List<Product> getAllProducts();

	void add(Product product);

	List<Product> getActiveProductList();

	List<Product> getProductByParams(String string, int i);

	List<Product> getProductListByCategoryId(int id);

}
