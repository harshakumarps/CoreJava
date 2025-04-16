package com.xworkz.internal;

public class AuthService extends Service {
    public AuthService(String name) {
        super(name);
    }

    public boolean authenticate(String username, String password) {
        System.out.println("Authenticating user: " + username + " for " + name + ".");
        // In a real scenario, this would involve actual authentication logic
        return username.equals("user") && password.equals("pass");
    }

    @Override
    public void start() {
        System.out.println("Starting authentication service: " + name + ".");
    }
}