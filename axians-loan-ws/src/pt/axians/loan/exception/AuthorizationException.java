package pt.axians.loan.exception;

//@WebFault(name = "AuthorizationFault", messageName = "AuthorizationFault")
public class AuthorizationException extends Exception {

	private static final long serialVersionUID = 9082131381817878117L;

	public AuthorizationException(String message) {
		super(message);
	}

	public String getFaultInfo() {
		return "Token invalid";
	}
}
