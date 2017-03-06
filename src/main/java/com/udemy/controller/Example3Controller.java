package com.udemy.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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

	private static final Log LOGGER = LogFactory.getLog( Example3Controller.class );
	
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
		LOGGER.info( "INFO TRACE" );
		LOGGER.warn( "WARNING TRACE" );
		LOGGER.error( "ERROR TRACE" );
		LOGGER.debug( "DEBUG TRACE" );
		model.addAttribute( "person", new Person( ) );
		//We do this in order to throw an internal error
		//		int i = 6 / 0;
		return Definitions.FORM_VIEW;
	}
	
	@PostMapping( "/addperson" )
	public ModelAndView addPerson( @ModelAttribute( "person" ) Person person ){
		LOGGER.info( "METHOD: 'addPerson' -- PARAMS: '" + person + "'" );
		ModelAndView modelAndView = new ModelAndView( Definitions.RESULT_VIEW );
		modelAndView.addObject( "person", person );
		LOGGER.info( "TEMPLATE: '" + Definitions.RESULT_VIEW + "' -- DATA: '" + person + "'");
		return modelAndView;
	}
	
}
