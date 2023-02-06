package org.ssglobal.training.codes.itemB;

public class PayFirstAdditionalException extends Exception {
	private static final long serialVersionUID = 7621357605584875037L;
	private String message = "Pay first before an additional scoop/s.";

	public PayFirstAdditionalException() {}

	public PayFirstAdditionalException(String message) {
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
