package org.ssglobal.training.codes.itemA;

public class BookException extends Exception {
	private static final long serialVersionUID = -734934103878102413L;
	private String message = "Exceeded the number of instances allowed.";

	public BookException() {}

	public BookException(String message) {
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
