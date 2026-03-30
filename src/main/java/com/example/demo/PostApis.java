//package com.example.demo;
// code dhwara froms pamputaru frontend vallu.


//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class PostApis {
//	
//	
//	@GetMapping("auth/login")
//	public String gtlogin() {
//		
//		return "Login successful.... using GET method";
//	}
//	
//@PostMapping("auth/login")
//	public String login(@RequestParam String email, @RequestParam String password) {
//		
//		return "Login successful:" + email + ",password: " + password;
//	}
//	
//    @PostMapping("auth/rest-password")
//	public String restPassword(@RequestParam String emailId) {
//		
//		return "mail sent. please check your inbox." + emailId;
//	}
//	
//	@PostMapping("auth/signup")
//	public String signup(@RequestBody UserData signupData) {
//		UserData signupData = new UserData();
//		
//		return " signup sucess " + signupData.getName()+ ", " + signupData.getEmail() + " , " + signupData.getMobile()+ " ," + signupData.getpassword() ;
//	}
//}
//
//






// Front vallu manaki Forms = Post Method anni ardham.
// max URL = 2048 Characters.

//package com.example.demo;
//
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class PostApis {
//
//    @PostMapping("auth/signup")
//    public String signup(@RequestBody UserData signupData) {
//
//        return signupData.getName() + " " +
//               signupData.getEmail() + " " +
//               signupData.getMobile() + " " +
//               signupData.getPassword();
//    }
//}
//





package com.example.demo;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostApis {

//    @GetMapping("auth/login")
//    public String gtlogin() {
//        return "Login successful.... using GET method";
//    }

    @PostMapping("auth/login")    //http://localhost:8080/auth/login   + email= random data, email= random data evali
    public String login(
            @RequestParam String email,
            @RequestParam String password) {

        return "Login successful:" + email +
               ", password: " + password;
    }

    @PostMapping("auth/reset-password")
    public String resetPassword(
            @RequestParam String emailId) {

        return "mail sent. please check your inbox. " + emailId;
    }
    
    @PostMapping("auth/signup")//----------------------------------->@RequestBody ******************************
    public String signup(@RequestBody UserData signupData) {

        return "Signup successful: " + signupData.getEmail();
        
//        Postman lo ela send cheyali
//
//        Body → raw → JSON
//        
//        {
//        	  "name": "Sateesh",
//        	  "email": "sateesh@gmail.com",
//        	  "password": "123456"
//        	}
    }
    
    
    
    @PostMapping("auth/signup/v2")//----------------------------------@ModelAttribute  ******************************
    public String signupv2(@ModelAttribute UserData signupData) {
    	return "Signup successful: "
    			  + "All data: " + signupData.toString(); // toDtring este anni functions ni call chestundi so
//                + "Name: " + signupData.getName()
//                + ", Email: " + signupData.getEmail()
//                + ", Password: " + signupData.getPassword()
//                + ", Mobile: " + signupData.getMobile(); 

        
        
       
//        Postman lo ela send cheyali
//
//        Body → form-data
//        or
//        Body → x-www-form-urlencoded
//        
//        | Key      | Value                                         |
//        | -------- | --------------------------------------------- |
//        | name     | Sateesh                                       |
//        | email    | [sateesh@gmail.com](mailto:sateesh@gmail.com) |
//        | password | 123456                                        |

    }

    
}


//http://localhost:8080/auth/signup

//{
//
//    "name": "signup_request",
//    "email": "user@example.com",
//    "password": "password123",
//    "mobile": "1234567890"
//}