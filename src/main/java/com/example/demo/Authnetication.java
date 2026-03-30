package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
public class Authnetication {
	
	@GetMapping("/auth-login")
    public String login() {  // void anni kadu String evali out postam lo ki vastundi.
    	System.out.println("Login API... in 2 secondsssssssss");
    	return "Login successful";
    }
	
	
	public String getMethodName(@RequestParam String param) {
		return new String();
	}
	
	@GetMapping("/create-account")
    public String signup() {
    	System.out.println("Sign API");
    	return " Signup sucessfull";
    }
	
	
	@GetMapping("/resetPassword")
    public String resetPassword() {
    	System.out.println("RestPassword API");
    	return "resetPassword sucessful";
    }
}
