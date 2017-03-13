package com.udemy.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.udemy.util.Definitions;

@Component( Definitions.EXAMPLE_COMPONENT )
public class ExampleComponent {

	private static final Log LOGGER = LogFactory.getLog( ExampleComponent.class );
	
	public void sayHi( ){
		LOGGER.info( "HI FROM COMPONENT BITCHES!!" );
	}
}
