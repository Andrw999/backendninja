package com.udemy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.model.Person;
import com.udemy.util.Definitions;

@Controller
@RequestMapping( "/example" )
public class ExampleController {
	
	//Primera forma
	@GetMapping( Definitions.EXAMPlE_VIEW + "String" )//esta es la forma resumida para hacer unRequestMapping de tipo GET.
//	@RequestMapping( value="/exampleString", method=RequestMethod.GET )
	public String exampleString( Model model ){
		
		model.addAttribute( "people", getPersonList( ) );
		return Definitions.EXAMPLE_RETUN;
	}
	
	//Segunda forma
	@GetMapping( Definitions.EXAMPlE_VIEW + "MAV" )
//	@RequestMapping( value="/exampleMAV", method=RequestMethod.GET )
	public ModelAndView  exampleMAV( ){
		
		//Very important to add template to the constructor
		ModelAndView modelAndView = new ModelAndView( Definitions.EXAMPlE_VIEW );
		modelAndView.addObject( "people", getPersonList( ) );
		
//		return new ModelAndView( Definitions.EXAMPLE_RETUN );
		return modelAndView;
	}
	
	private List<Person> getPersonList( ){
		List<Person> people = new ArrayList<>( );
		people.add( new Person( "Mike", 41 ) );
		people.add( new Person( "Jhon", 31 ) );
		people.add( new Person( "Lucas", 35 ) );
		people.add( new Person( "Lucy", 60 ) );
		
		return people;
	}
}
