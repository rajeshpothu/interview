package com.slokam.exceprionhandling;

public class Errorinfo {
	
	
	private String message;
	private String exception;
	

	public Errorinfo(String message, Exception ex) {
		super();
		this.message = message;
		
		if(ex!=null){
		
		this.exception = ex.getLocalizedMessage();
	}
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getException() {
		return exception;
	}
	public void setException(String exception) {
		this.exception = exception;
	}

}
