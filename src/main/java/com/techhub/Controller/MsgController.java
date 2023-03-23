package com.techhub.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
	
	public MsgController() {
		  System.out.print("MsgRestController::Constructor");
	}
	
	@GetMapping("/welcome")
	public  ResponseEntity<String> getWelcomeMsg() {
		
		String msg="Good Morning";
		
		return new ResponseEntity<String>(msg, HttpStatus.OK);
		
	}
	    @GetMapping("/greet")
	   public String getGreetMsg() {
	    	
	    	String msg="Good Afternoon";
	    	
	    	return msg;
		   
	   }
	

}
