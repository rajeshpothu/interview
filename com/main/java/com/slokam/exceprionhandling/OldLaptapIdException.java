package com.slokam.exceprionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class OldLaptapIdException extends RuntimeException {

	
	        /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

			public OldLaptapIdException(String message){
	        	
	        	super(message);
	        }
}
