package com.example.demo;

import lombok.Data;

@Data
public class UserData {

  public String name;
  public String email;
  public String password;
  public String mobile;
  
}














//package com.example.demo;



//
//
//
//public class UserData {
//
//    public String name;
//    public String email;
//    public String password;
//    public String mobile;
//
//    public String getName() {
//        return name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getPassword() {   // IMPORTANT
//        return password;
//    }
//
//    public String getMobile() {
//        return mobile;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public void setMobile(String mobile) {
//        this.mobile = mobile;
//    }
//}
//
//
//


//
//import java.util.jar.Attributes.Name;
//
//public class UserData {
//	
//	public String name;
//	public String email;
//	public String password;
//	public String mobile;
//	
//	public void setName(String name) {
//	    this.name = name;
//	}
//
//	public String getName() {
//	    return this.name;
//	}
//
//	public void setEmail(String email) {
//	    this.email = email;
//	}
//
//	public String getEmail() {
//	    return this.email;
//	}
//
//	public void setPassword(String password) {
//	    this.password = password;
//	}
//
//	public String getpassword() {
//	    return this.password;
//	}
//
//	public void setMobile(String mobile) {
//	    this.mobile = mobile;
//	}
//
//	public String getMobile() {
//	    return this.mobile;
//	}
//}
//
//
//
//
///*
//==============================
//GETTERS & SETTERS EXPLANATION
//==============================
//
//public void setName(String name) {
//    this.name = name;
//}
//// setName() method:
//// bayata nundi name value ni object lo set cheyadaniki use chestam
//// this.name → class variable
//// name → method parameter
//
//
//public String getName() {
//    return this.name;
//}
//// getName() method:
//// object lo unna name value ni return chestundi
//
//
//public void setEmail(String email) {
//    this.email = email;
//}
//// email value ni set chestundi
//
//
//public String getEmail() {
//    return this.email;
//}
//// email value ni return chestundi
//
//
//public void setPassword(String password) {
//    this.password = password;
//}
//// password ni set chestundi
//
//
//public String getpassword() {
//    return this.password;
//}
//// password ni return chestundi
//// NOTE: method name ideally getPassword undali (Java naming convention)
//
//
//public void setMobile(String mobile) {
//    this.mobile = mobile;
//}
//// mobile number set chestundi
//
//
//public String getMobile() {
//    return this.mobile;
//}
//// mobile number return chestundi
//
//
//==============================
//KEY CONCEPT
//==============================
//
//- Setters → values assign cheyadaniki
//- Getters → values retrieve cheyadaniki
//- Encapsulation principle follow chestundi
//
//==============================
//BEST PRACTICE
//==============================
//
//Instead of manual ga rayadam,
//Lombok use cheyachu:
//
//@Data
//
//Appudu automatic ga getters/setters create avutayi
//*/