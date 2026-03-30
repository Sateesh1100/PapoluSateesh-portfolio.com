
//  //10 class

//package com.example.demo.controller;
//
//import com.example.demo.service.AuthService;
//
//import jakarta.validation.Valid;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.validation.BindingResult;
////import org.springframework.validation.method.MethodValidationResult;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.pojo.LoginApiData;
//
//@RestController
//public class AuthController {
//
//    @Autowired //-------> kindha rasina object kuda create cheyavasaram leee
//    private AuthService authService;
//
//    @PostMapping("/v2/login")      //http://localhost:8080/v2/login
//    public Map<String, String> login(
//            @Valid @RequestBody LoginApiData loginApiData,
//            BindingResult validationResult) {
//
//        System.out.println(validationResult.hasErrors());
//        
//        if(validationResult.hasErrors() == true ) {
//        	
//        	Map<String, String> errors = new HashMap<String, String>();
//        	
//        	validationResult.getFieldErrors().forEach(error ->{
//        		
//        		errors.put(error.getField(), error.getDefaultMessage());
////        		System.out.println(error.getField());
////        		System.out.println(error.getDefaultMessage());
//        		
//        	});
//        	errors.put("result", "failed");
//        	
//        	System.out.println(errors);
//        	return  errors;
//        	
//        	
//        }else {
//        	String responseString = authService.login(loginApiData);
//        	Map<String, String> response = new HashMap<String, String>(); //dumyy
//        	response.put("logintresult", responseString);
//        	response.put("result", "sucess");
//
//            return response;
//        	
//        }
//        	
//
//        
//    }
//}    
//




package com.example.demo.controller;

import com.example.demo.service.AuthService;

import jakarta.validation.Valid;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
//import org.springframework.validation.method.MethodValidationResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.pojo.LoginApiData;
import com.example.demo.pojo.SignupApiData;

@RestController
public class AuthController {

    @Autowired //-------> kindha rasina object kuda create cheyavasaram leee
    private AuthService authService;
    
    @PostMapping("/signup")
    public Object signup(@RequestBody SignupApiData signupApiData) { // -----------------------------------------over 
    	User  newUser = authService.signup(signupApiData);
    	return newUser;
    	
    	// User dhagara error vaste control space select import com.example.demo.entity.User;

    	
    }
    
    
    
    
    

    @PostMapping("/v2/login")      //http://localhost:8080/v2/login
    public ResponseEntity<Map<String, Object>> login(  //
            @Valid @RequestBody LoginApiData loginApiData,
            BindingResult validationResult) {

        System.out.println(validationResult.hasErrors());
        
        if(validationResult.hasErrors() == true ) {
        	
        	Map<String, String> errors = new HashMap<String, String>();
        	
        	validationResult.getFieldErrors().forEach(error ->{
        		
        		errors.put(error.getField(), error.getDefaultMessage());
//        		System.out.println(error.getField());
//        		System.out.println(error.getDefaultMessage());
        		
        	});
//        	errors.put("result", "failed");// remove chesam ok 
         	
        	System.out.println(errors);
        	
        	int[] numbers = {1,2,3,4,};
        	Map<String, Object>response = new HashMap<String, Object>(); // Object = O (Capital)
        	response.put("result", "failed");
        	response.put("errors", errors); // errors = map variable
        	response.put("message", "Unable to process your request");
        	response.put("No of attempts", "6");
        	response.put("Hints", numbers);
        	
        	return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        	
        	
        }else {
        	String responseString = authService.login(loginApiData);
        	Map<String, Object> response = new HashMap<String, Object>(); //dumyy
        	response.put("logintresult", responseString);
        	response.put("result", "sucess");
        	
        	
        	Map<String,String>userDetails = new HashMap<String, String>();
        	
        	userDetails.put("name", "Sateesh");
        	userDetails.put("email", loginApiData.getEmail());
        	userDetails.put("mobile", "9074764766");
        	userDetails.put("profile_pic", "https://cloud.aws.com");
        	
        	response.put("userData", userDetails);
        	
        	
  
            return ResponseEntity.status(HttpStatus.OK).body(response);
        	
        }
        	

        
    }
}    
















//Explanation Line-by-Line
//@RestController
//Meaning:
//I class API controller ani Spring ki cheptundi.
//
//@Autowired
//
//Meaning:
//Spring automatic ga AuthService object create chestundi.
//Manual ga new cheyyalsina avasaram ledu.
//Equivalent manual code:
//	AuthService authService = new AuthService();
//
//
//
//@PostMapping("/v2/login")
//	Meaning:
//		POST request vasthe ee method run avuthundi.
//
//		URL:
//		http://localhost:8080/v2/login
//			
//			
//@RequestBody
//
//Meaning:
//Postman nundi vachina JSON data ni object ga convert chestundi.
//
//JSON:
//
//{
//  "email": "Contact@softwareschool.co",
//  "password": "12345678"
//}
//
//Convert avuthundi:LoginApiData loginApiData
//
//Important Line
//String responseString = authService.login(loginApiData);
//
//Meaning:
//
//Controller → Service method call chestundi
//loginApiData object ni pass chestundi
