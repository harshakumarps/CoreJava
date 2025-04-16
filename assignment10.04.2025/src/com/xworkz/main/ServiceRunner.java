package com.xworkz.main;

import com.xworkz.internal.AuthService;
import com.xworkz.internal.Service;

public class ServiceRunner {
    public static void main(String[] args) {
        Service genericService = new Service("GenericService");
        genericService.start();
        System.out.println(genericService);

        AuthService auth = new AuthService("UserAuth");
        auth.start();
        boolean isAuthenticated = auth.authenticate("user", "pass");
        System.out.println("Authentication successful: " + isAuthenticated);

        Service upcastedAuth = new AuthService("AdminAuth");
        upcastedAuth.start();
        System.out.println(upcastedAuth);
    }
}