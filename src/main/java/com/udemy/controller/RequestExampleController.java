package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.util.Definitions;

@Controller
@RequestMapping( name="getRequestsample" )
public class RequestExampleController {

	//localhost:8080/getRequestsample/request1?
	@GetMapping( "/request1" )
	public ModelAndView request1( ){
		ModelAndView modelAndView = new ModelAndView( Definitions.EXAMPlE_REQUEST_VIEW );
		return modelAndView;
	}
	
}
