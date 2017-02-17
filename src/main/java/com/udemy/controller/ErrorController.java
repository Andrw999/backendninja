package com.udemy.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.udemy.util.Definitions;

@ControllerAdvice
public class ErrorController {

	@ExceptionHandler( Exception.class )
	public String showInternalServerError( ){
		return Definitions.ERROR_500_VIEW;
	}
}
