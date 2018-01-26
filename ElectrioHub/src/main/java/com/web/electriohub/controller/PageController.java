package com.web.electriohub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value={"/","index","home"})
	public ModelAndView home(){
		ModelAndView mav = new ModelAndView("page");
		mav.addObject("title","Home");
		mav.addObject("isHome",true);
		
		return mav;	
	}
	
	@RequestMapping("/login")
	public ModelAndView login(){
		ModelAndView mav = new ModelAndView("page");
		mav.addObject("title","Login");
		mav.addObject("isLogin",true);
		
		return mav;	
	}
	
}
