package com.udemy.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.udemy.repository.CourseJpaRepository;
import com.udemy.util.Definitions;

@Component( Definitions.EXAMPLE_COMPONENT )
public class ExampleComponent {

	private static final Log LOGGER = LogFactory.getLog( ExampleComponent.class );
	
	@Autowired
	@Qualifier( "courseJpaRepository" )
	private CourseJpaRepository courseJpaRepository;
	
	public void sayHi( ){
		LOGGER.info( "HI FROM COMPONENT BITCHES!!" );
	}
}
