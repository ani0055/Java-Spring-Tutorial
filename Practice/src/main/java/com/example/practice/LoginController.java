package com.example.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    // Show login page
    @GetMapping("/login")
    public String showLoginPage() {
        return "Please enter your credentials";
    }

    // Process login form submission
    @PostMapping("/login")
    public String processLogin(@RequestParam String username,
                               @RequestParam String password) {
        if ("admin".equals(username) && "1234".equals(password)) {
            return "Login successful! Welcome " + username;
        } else {
            return "Login failed! Invalid credentials";
        }
    }

    // Handle logout
    @GetMapping("/logout")
    public String logout() {
        return "You have been logged out";
    }
}
