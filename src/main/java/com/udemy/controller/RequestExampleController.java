package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.util.Definitions;

@Controller
@RequestMapping( "/getRequestsample" )//This must to be only the String do not use "name" I donn't know how can this be use
public class RequestExampleController {

	//localhost:8080/getRequestsample/request1?name=Jhon
	//localhost:8080/getRequestsample/request1?name=Lucas
	@GetMapping( "/request1" )
	public ModelAndView request1( @RequestParam( name="name", required=false, defaultValue="NULL" ) String name ){
		ModelAndView modelAndView = new ModelAndView( Definitions.EXAMPlE_REQUEST_VIEW );
		modelAndView.addObject( "name", name );
		return modelAndView;
	}
	
}
