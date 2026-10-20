package ui;

import service.AuthService;
import util.InputUtil;

public class LoginMenu {

    private final AuthService authService;
    private final StudentMenu studentMenu;

    public LoginMenu(AuthService authService,
                     StudentMenu studentMenu) {
        this.authService = authService;
        this.studentMenu = studentMenu;
    }

    public void start() {
        int attempts = 0;

        while (attempts < 3) {
            System.out.println("\n===== ADMIN LOGIN =====");

            String username = InputUtil.readNonEmptyString(
                    "Enter username: ");

            String password = InputUtil.readNonEmptyString(
                    "Enter password: ");

            if (authService.validateLogin(username, password)) {
                System.out.println("Login successful!");
                studentMenu.start();
                return;
            }

            attempts++;
            System.out.println("Invalid username or password.");
            System.out.println("Attempts remaining: " + (3 - attempts));
        }

        System.out.println("Maximum attempts reached. Access denied.");
    }
}
