package com.udemy.component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.udemy.util.Definitions;

@Component( Definitions.REQUEST_TIME_COMPONENT )
public class RequestTimeInterceptor extends HandlerInterceptorAdapter{
	
	private static final Log LOGGER = LogFactory.getLog( RequestTimeInterceptor.class );

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		request.setAttribute( "startTime", System.currentTimeMillis( ) );
		
		return true;
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		long startTime = (long) request.getAttribute( "startTime" );
		LOGGER.info( "--REQUEST URL: '" + request.getRequestURL( ).toString( ) + "' --TOTAL TIME: '" + ( System.currentTimeMillis( ) - startTime ) + "ms" );
	}
	
}
