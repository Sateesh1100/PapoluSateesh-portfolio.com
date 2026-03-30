package com.example.demo;


// @RequestParam = ? vastadi 
//@PathVariable = ? radu


import java.net.Authenticator.RequestorType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GetAPIs {
	
    @GetMapping("/watch") //http://localhost:8080/watch?v=_j4TfFLM&ab_channel=Funmofik=rerergfer
	public String getVideoDetails (@RequestParam String v,@RequestParam String ab_channel) {
		return"Video Id :" + v + " AB Channel :" + ab_channel;

	}
    @GetMapping("/api/v1/users/web_profile_info") //http://localhost:8080/api/v1/users/web_profile_info?username=puriconnects
    public String getProfileDetails(@RequestParam String username) {

        return "Profile details of: " + username;
        //http://localhost:8080/api/v1/users/web_profile_info?username=puriconnects
        // api/v1/users/web_profile_info ? username  = ***************
    }
     
    @GetMapping("c/{courceId}") //http://localhost:8080/c/live-java-backend-reactclass
    public String getCoursesDetails(@PathVariable String courceId) { // ? vundadu ? vunte google lo ranking evadu so manadi first search lo chupinchadu so
    	return "courses details are :" + courceId;
    	
    }
    
    @GetMapping("p/{postId}") // http://localhost:8080/p/instgram
    public String getPostDetails(@PathVariable String postId) {
        return "Instagram post details: " + postId;
    }

    //https://www.amazon.in/Apple-iPhone-15-128-GB/dp/B0CHX2F5QT/

    @GetMapping("{seoTitle}/dp/{productId}") //dp = constant. http://localhost:8080/apple-iphone-17-512GB/dp/BOCHX2F5QT
    public String getAmazonProductDetails(@PathVariable String seoTitle, @PathVariable String productId) {
        return "Product details: " + seoTitle + ", id: " + productId;
        
        
        
//        {seoTitle}   -> dynamic value (product name)
//        dp           -> constant (fixed text)
//        {productId}  -> dynamic value (product id)
    }

}


//| Feature         | @GetMapping     | @PutMapping          |
//| --------------- | --------------- | -------------------- |
//| Purpose         | Get / Read data | Update existing data |
//| HTTP Method     | GET             | PUT                  |
//| Data Change     | ❌ No change     | ✅ Updates data       |
//| Used in Browser | ✅ Yes           | ⚠️ Usually Postman   |
//| Example         | View user       | Update user          |
//


/*
==============================
SPRING BOOT GET APIs - FULL EXPLANATION
==============================

package com.example.demo;
// ee line package ni define chestundi
// project lo classes ni organize cheyadaniki use chestam

import java.net.Authenticator.RequestorType;
// idi unnecessary import (use avvadhu ee code lo)
// clean code kosam remove cheyadam better

import org.springframework.web.bind.annotation.GetMapping;
// GET request ni handle cheyadaniki use chestam

import org.springframework.web.bind.annotation.PathVariable;
// URL path lo unna dynamic values ni capture cheyadaniki use chestam

import org.springframework.web.bind.annotation.RequestParam;
// URL query parameters ni capture cheyadaniki use chestam

import org.springframework.web.bind.annotation.RestController;
// ee class ni REST API controller ga mark chestundi
// methods lo return aina data direct ga response ga velthundi


@RestController
public class GetAPIs {
// ee class lo multiple GET APIs create chesam


    ==============================
    1) YOUTUBE STYLE API
    ==============================

    @GetMapping("watch")
    // ee endpoint:
// http://localhost:8080/watch?v=abc123&ab_channel=Telugu

	public String getVideoDetails (@RequestParam String v,@RequestParam String ab_channel)
    // @RequestParam dwara query params tiskuntam
    // v = video id
    // ab_channel = channel name

	{
		return "Video Id :" + v + " AB Channel :" + ab_channel;
        // example output:
        // Video Id : abc123 AB Channel : Telugu
	}


    ==============================
    2) INSTAGRAM PROFILE API
    ==============================

    @GetMapping("api/v1/users/web_profile_info")
    // ee API:
// http://localhost:8080/api/v1/users/web_profile_info?username=sateesh

    public String getProfileDetails(@RequestParam String username)
    // username ni query param nundi tiskuntam
    {
        return "Profile details of: " + username;
    }


    ==============================
    3) COURSE DETAILS API
    ==============================

    @GetMapping("c/{courceId}")
    // ee API:
// http://localhost:8080/c/java

    public String getCoursesDetails(@PathVariable String courceId)
    // @PathVariable dwara URL path lo unna value capture chestam
    {
    	return "courses details are :" + courceId;
    }


    ==============================
    4) INSTAGRAM POST API
    ==============================

    @GetMapping("p/{postId}")
    // ee API:
// http://localhost:8080/p/101

    public String getPostDetails(@PathVariable String postId)
    {
        return "Instagram post details: " + postId;
    }


    ==============================
    5) AMAZON STYLE PRODUCT API
    ==============================

    //https://www.amazon.in/Apple-iPhone-15-128-GB/dp/B0CHX2F5QT/
    // ee URL structure ni follow ayi mana API create chesam

    @GetMapping("{seoTitle}/dp/{productId}")
    // example:
// http://localhost:8080/iphone-15/dp/B0CHX2F5QT

    public String getAmazonProductDetails(@PathVariable String seoTitle, @PathVariable String productId)
    {
        return "Product details: " + seoTitle + ", id: " + productId;
    }


==============================
IMPORTANT CONCEPTS
==============================

1) @RestController:
   -> class ni REST API ga treat chestundi

2) @GetMapping:
   -> GET request ni handle chestundi

3) @RequestParam:
   -> query params kosam
   -> example: ?id=123

4) @PathVariable:
   -> URL path lo dynamic values kosam
   -> example: /p/123

==============================
INTERVIEW POINT
==============================

Real world lo:
- YouTube → RequestParam use chestundi
- Instagram → PathVariable use chestundi
- Amazon → SEO URLs use chestundi

==============================
*/