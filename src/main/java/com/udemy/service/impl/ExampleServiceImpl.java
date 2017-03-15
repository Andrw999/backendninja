package com.udemy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.udemy.model.Person;
import com.udemy.service.ExampleService;

@Service( "exampleService" )
public class ExampleServiceImpl implements ExampleService{

	private static final Log LOGGER = LogFactory.getLog( ExampleServiceImpl.class );
	
	@Override
	public List<Person> getListPeople( ) {
		List<Person> people = new ArrayList<>( );
		people.add( new Person( "Mike", 41 ) );
		people.add( new Person( "Jhon", 31 ) );
		people.add( new Person( "Lucas", 35 ) );
		people.add( new Person( "Lucy", 60 ) );
		LOGGER.info( "Users have been added from SERVICE!!" );
		return people;
	}

}
