package com.slokam.exceprionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomResponseExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler
	public final ResponseEntity<Object> handleProjectIdException(OldLaptapIdException ol, WebRequest req) {
		OldLaptapIdException oldLaptapIdExceptionResponse = new OldLaptapIdException(ol.getMessage());
		return new ResponseEntity(oldLaptapIdExceptionResponse, HttpStatus.BAD_REQUEST);

	}

}
