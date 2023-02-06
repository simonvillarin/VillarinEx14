package org.ssglobal.training.codes.itemA;

public class AuthorException extends Exception {
	private static final long serialVersionUID = -4060023122458634251L;
	private String message = "Exceeded the number of instances allowed.";
	
	public AuthorException() {}
	
	public AuthorException(String message) {
		 this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	
	@Override
	public void printStackTrace() {
		System.out.println(message);
	}
}
