package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class my3amazon {
	
	@GetMapping("/amazon")
	public String amazonWebString (@RequestParam String k, @RequestParam String i, @RequestParam String crid ) {
		System.out.println("AMAZON sucessfull");
		return "KKKKK:" + k + "iiiiii:" + i + "Crid:"+ crid;
		
		
	}

	
	

}
