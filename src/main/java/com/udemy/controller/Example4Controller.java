package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.udemy.util.Definitions;

@Controller
@RequestMapping( "/example4" )
public class Example4Controller {

	@GetMapping( "/404" )
	public String error_404_view( ){
		return Definitions.ERROR_404_VIEW;
	}
	
	@GetMapping( "/500" )
	public String error_500_view( ){
		return Definitions.ERROR_500_VIEW;
	}
}
