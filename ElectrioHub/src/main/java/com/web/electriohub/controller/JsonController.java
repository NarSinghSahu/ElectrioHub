package com.web.electriohub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.electriohubbackend.dao.CategoryDao;
import com.web.electriohubbackend.dao.ProductDao;
import com.web.electriohubbackend.dto.Product;

@Controller
@RequestMapping("/json/data")
public class JsonController {

	@Autowired
	ProductDao productDao;
	
	@Autowired
	CategoryDao categoryDao;
	
	
	@RequestMapping("/admin/product")
	@ResponseBody
	public List<Product> getAllProductsForAdmin(){
		
		return productDao.getAllProducts();
	}
	
	@RequestMapping("/active/product")
	@ResponseBody
	public List<Product> getAllActiveProducts(){
		
		return productDao.getActiveProductList();
	}
	
	@RequestMapping("/product/{id}")
	@ResponseBody
	public List<Product> getProductsByCategoryId(@PathVariable("id") int id){
		
		return productDao.getProductListByCategoryId(id);
	}
	
	@RequestMapping("/product/most/viewed")
	@ResponseBody
	public List<Product> getMostViewedProduct(){
		
		return productDao.getProductByParams("views",5);
	}
	
	@RequestMapping("/product/most/purchased")
	@ResponseBody
	public List<Product> getMostPurchasedProduct(){
		
		return productDao.getProductByParams("purchases",5);
	}
		
}
