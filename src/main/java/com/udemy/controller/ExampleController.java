package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.util.Definitions;

@Controller
@RequestMapping( "/example" )
public class ExampleController {
	
	//Primera forma
	@GetMapping( Definitions.EXAMPlE_VIEW + "String" )//esta es la forma resumida para hacer unRequestMapping de tipo GET.
//	@RequestMapping( value="/exampleString", method=RequestMethod.GET )
	public String exampleString( Model model ){
		model.addAttribute( "name", "motherfuckers" );
		return Definitions.EXAMPLE_RETUN;
	}
	
	//Segunda forma
	@GetMapping( Definitions.EXAMPlE_VIEW + "MAV" )
//	@RequestMapping( value="/exampleMAV", method=RequestMethod.GET )
	public ModelAndView  exampleMAV( ){
		
		//Very important to add template to the constructor
		ModelAndView modelAndView = new ModelAndView( Definitions.EXAMPlE_VIEW );
		modelAndView.addObject( "name", "motherfuckers" );
		
//		return new ModelAndView( Definitions.EXAMPLE_RETUN );
		return modelAndView;
	}
}
