package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.udemy.model.Person;
import com.udemy.util.Definitions;

@Controller
@RequestMapping( "/example3" )
public class Example3Controller {

	//Redirecciones primera forma
	//Se debe de dar el path a donde
	//se hara la redirección
//	@GetMapping( "/" )
//	public String redirect( ){
//		return "redirect:/example3/showform";
//	}
	
	//Con el Objeto Redirect de spring
	//Se debe de dar el path a donde
	//se hara la redirección
	@GetMapping( "/" )
	public RedirectView redirect( ){
		return new RedirectView( "/example3/showform" );
	} 
	
	@GetMapping( "/showform" )
	public String showForm( Model model ){
		model.addAttribute( "person", new Person( ) );
		int i = 6 / 0;
		return Definitions.FORM_VIEW;
	}
	
	@PostMapping( "/addperson" )
	public ModelAndView addPerson( @ModelAttribute( "person" ) Person person ){
		ModelAndView modelAndView = new ModelAndView( Definitions.RESULT_VIEW );
		modelAndView.addObject( "person", person );
		return modelAndView;
	}
	
}
