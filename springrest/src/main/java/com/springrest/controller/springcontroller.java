package com.springrest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class springcontroller {
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView sayHello() {
		ModelAndView model=new ModelAndView("home");
		System.out.println(model);
		return model;
	}

}
