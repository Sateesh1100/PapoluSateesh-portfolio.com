package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Auth_2 {
	
	@PostMapping("/v1/login") //http://localhost:8080/v1/login
	public String login(@RequestBody loginData LoginDataa) {
		
		String dbEmail = "Contact@softwareschool.co";
		String dbpassword = "12345678";
		
//		if(dbEmail == "Contact@softwareschool.co" && dbpassword =="12345678" ) {
		
		if(dbEmail.equals(LoginDataa.getEmail()) && dbpassword.equals(LoginDataa.getPassword())) {
			
			return "Login sucess";
			
		}else {
			return "Invalid login Credentials"; 
		}
		
//		{
//		    "email": "user@example.com",
//		    "password": "password123"
//		}
	}

}











