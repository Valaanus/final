package com.cg.dardenrestapi.controller;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//@Controller
//@ResponseBody

@RestController

public class helloworldcontroller {
	
	//HTTP Get Request
	@GetMapping("/hello-world")
	public String Helloworld() {
		return "Hello World";
	}
	
	

}
