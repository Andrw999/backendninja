package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.model.Person;
import com.udemy.util.Definitions;

@Controller
@RequestMapping( "/example3" )
public class Example3Controller {

	@GetMapping( "/showform" )
	public String showForm( Model model ){
		model.addAttribute( "person", new Person( ) );
		return Definitions.FORM_VIEW;
	}
	
	@PostMapping( "/addperson" )
	public ModelAndView addPerson( @ModelAttribute( "person" ) Person person ){
		ModelAndView modelAndView = new ModelAndView( Definitions.RESULT_VIEW );
		modelAndView.addObject( "person", person );
		return modelAndView;
	}
	
}
