package service;

public class AuthService {

    private final String username = "admin";
    private final String password = "Admin@123";

    public boolean validateLogin(String enteredUsername,
                                 String enteredPassword) {
        return username.equals(enteredUsername)
                && password.equals(enteredPassword);
    }
}
