//  //10 class
//package com.example.demo.pojo;
//
//import jakarta.validation.constraints.Min;
////import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.Pattern;
//import jakarta.validation.constraints.Size;
//import lombok.Data;
//
//@Data
//public class LoginApiData {
//	
//    @NotNull(message = "Email is missing")
//    @NotBlank(message = "Email is shold not be Blank")
//    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$",message = "enter a valid E-mail")
//    private String email;
//    
//    @NotNull(message = "password  is missing")
//    @NotBlank(message = "password is min 8 characters")
//    @Size(min = 8, max = 20)
//    private String password;
//
//}















package com.example.demo.pojo;

import jakarta.validation.constraints.Min;
//import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class LoginApiData {
	
    @NotNull(message = "Email is missing")
    @NotBlank(message = "Email is shold not be Blank")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$",message = "enter a valid E-mail")
    private String email;
    
    @NotNull(message = "password  is missing")
    @NotBlank(message = "password is min 8 characters")
    @Size(min = 8, max = 20)
    private String password;

}











//Purpose:
//User nundi vachina data ni store cheyadaniki.
//
//Fields:
//email
//password
//
//Getters:
//value read cheyadaniki
//
//Setters:
//value set cheyadaniki