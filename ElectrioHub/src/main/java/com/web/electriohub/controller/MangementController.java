package com.web.electriohub.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.web.electriohubbackend.dao.CategoryDao;
import com.web.electriohubbackend.dao.ProductDao;
import com.web.electriohubbackend.dto.Product;

@Controller
@RequestMapping("/manage")
public class MangementController {
	
	@Autowired
	ProductDao productDao;
	
	@Autowired
	CategoryDao categoryDao;

	/* this handler will bind an empty new product to productmanagement form
	 * and display msg if product is submitted successfully
	 */
	@RequestMapping("/product")
	public ModelAndView bindProductToForm(){
		ModelAndView mav = new ModelAndView("page");
		mav.addObject("title","Management");
		mav.addObject("isManage",true);
		Product nProduct = new Product();
		nProduct.setSupplierId(1);
		nProduct.setActive(1);
		mav.addObject("product",nProduct);
		
		return mav;
		
	}
	
	
	/*this handler will receive the submitted product and redirect
	 * to #bindProductToForm() handler with request param success 
	 * which specifies if product is submitted or not 
	 * 
	 */
	
	@RequestMapping("product/add")
	public String addProduct(@Valid @ModelAttribute("product")Product mProduct,BindingResult results,Model model){
		
		// validating product for multipart file
		
		
		//----------------------------------------
		
		productDao.add(mProduct);
		
		return "redirectTo:/manage/product?success=yes";
	}
	
	
	
	
	
	
	
	
	
	
	
}
