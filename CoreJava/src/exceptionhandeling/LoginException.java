package exceptionhandeling;

public class LoginException extends Exception {
public LoginException() {
	super("user not found");
}
}
