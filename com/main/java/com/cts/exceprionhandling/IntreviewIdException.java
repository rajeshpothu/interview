package com.cts.exceprionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class IntreviewIdException extends RuntimeException {

	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

			public IntreviewIdException(String message){
	        	
	        	super(message);
	        }
}
