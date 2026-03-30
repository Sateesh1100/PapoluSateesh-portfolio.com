//package com.example.demo.service;
//
//import org.springframework.stereotype.Service;
//
////import com.example.demo.loginData;
//import com.example.demo.pojo.LoginApiData;
//
////@Service
////public class AuthService {
////	// AuthService lo mana 1.login 2. signup 3.rest-password task samdanchina codes vuntay 
////	
////	public String login(LoginApiData loginDataa) {
////		String dbEmail = "Contact@softwareschool.co";
////		String dbpassword = "12345678";
////		
//////		if(dbEmail == "Contact@softwareschool.co" && dbpassword =="12345678" ) {
////		
////		if(dbEmail.equals(LoginDataa.getEmail()) && dbpassword.equals(LoginDataa.getPassword())) {
////			
////			return "Login sucess";
////			
////		}else {
////			return "Invalid login Credentials"; 
////		}
////	}
////
////}
//
//
//
//@Service
//public class AuthService {
//
//    public String login(LoginApiData loginDataa) {
//
//        String dbEmail = "Contact@softwareschool.co";
//        String dbpassword = "12345678";
//
//        if (dbEmail.equals(loginDataa.getEmail()) &&
//            dbpassword.equals(loginDataa.getPassword())) {
//
//            return "Login success";
//
//        } else {
//            return "Invalid login Credentials";
//        }
//    }
//}


//package com.example.demo.service;
//
//import com.example.demo.GetAPIs;
//import org.springframework.aop.AfterReturningAdvice;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.pojo.LoginApiData;
//
//@Service
//public class AuthService {
//
//    // AuthService lo mana 1.login 2.signup 3.reset-password task samdanchina codes vuntay
//
//    private final GetAPIs getAPIs;
//
//	AuthService(GetAPIs getAPIs) {
//		this.getAPIs = getAPIs;
//	}
//
//	public String login( LoginApiData loginApiData) {
//
//        String dbEmail = "Contact@softwareschool.co";
//        String dbpassword = "12345678";
//        
//        System.out.println(loginDataa.getEmail()); // null anni vastadi eclipse lo 
//        if(loginDataa.getEmail()== null) {
//        	//System.out.println("Email is missing");
//        	return "Email is missing "; 
//        	
//        	
//        }
//         
//       // return loginDataa.getEmail();  // loginApiData = loginDataa
//
//         if(dbEmail == "Contact@softwareschool.co" && dbpassword =="12345678" )
//
//       if (dbEmail.equals(loginDataa.getEmail()) &&
//           dbpassword.equals(loginDataa.getPassword())) {
//
//           return "Login success";
//
//       } else {
//           return "Invalid login Credentials";
//       }
//
//    }
//
//}
//






package com.example.demo.service;

import java.util.jar.Attributes.Name;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;
import com.example.demo.pojo.LoginApiData;
import com.example.demo.pojo.SignupApiData;
import com.example.demo.repository.UserRepository;
import com.example.demo.entity.User;

@Service
public class AuthService {
	
    @Autowired
    public UserRepository userRepository;
    public String login(LoginApiData loginDataa) {

        String dbEmail = "Contact@softwareschool.co";
        String dbpassword = "12345678";
        
//        if(loginDataa.getPassword().length() < 8) {
//        	return "Paaword minimum 8 charaters";
//        	
//        }
         
        if (loginDataa.getPassword() == null) {
            return "Password is missing";
        }

        if (loginDataa.getPassword().length() < 8) {
            return "Password minimum 8 characters";
        }
        return "Login";
    
//       boolean isEmailValid = loginDataa.getEmail().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
//       if(isEmailValid == true) {
//    	   return "Email is in proper format.";
//       
//    	   
//       }else {
//    	   return "Email is invalid.";
//    	   
//    	   
//       } // email kiiiiiiiiiiiiiii
       
//        System.out.println("Email: " + loginDataa.getEmail());
//
//        if (loginDataa.getEmail() == null) {
//            return "Email is missing";
//        }else {
//        	if(loginDataa.getEmail().length() == 0) {
//        		return "Email is empty";
//        		
//        	}
//        }
//        
//        if(loginDataa.getPassword() == null) {
//        	return "password is Mandatory ";
//        }else {
//        	if(loginDataa.getPassword().length() == 0 ){
//        		return "Password is empty";
//        		
//        	}
//        	
//        }

//        if (dbEmail.equals(loginDataa.getEmail()) &&
//            dbpassword.equals(loginDataa.getPassword())) {
//
//            return "Login success";
//
//        } else {
//            return "Invalid login credentials";
//        }
       
       
    }
    public User signup(SignupApiData signupApiData) {
    	
    	User user = new User();
    	
    	user.setEmail(signupApiData.getEmail());
    	user.setName(signupApiData.getName());
    	user.setPassword(signupApiData.getPassword());
    	
//    	userRepository.save(user);
    	User newuser = userRepository.save(user);
    	return newuser;
    }
}









//Explanation Line-by-Line
//@Service
//Meaning:
//I class business logic handle chestundi ani Spring ki cheptundi.
//
//Dummy Database Values
//
//
//String dbEmail = "Contact@softwareschool.co";
//String dbpassword = "12345678";
//Meaning:
//Temporary database values
//Real project lo database nundi vastayi
//
//Core Logic
//if (dbEmail.equals(loginDataa.getEmail()) &&
//	    dbpassword.equals(loginDataa.getPassword()))
//	
//	
//	
//	
//	1) Postman request send chestundi
//
//	POST /v2/login
//
//	2) Controller method run avuthundi
//
//	login(@RequestBody LoginApiData)
//
//	3) Spring JSON ni object ga convert chestundi
//
//	LoginApiData object create
//
//	4) Controller Service ni call chestundi
//
//	authService.login(loginApiData)
//
//	5) Service email/password compare chestundi
//
//	6) Result return chestundi
//
//	7) Response Postman ki velthundi