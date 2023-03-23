package com.techhub.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techhub.binding.Customer;

@RestController
public class CustomerRestController {
	
	@GetMapping("/customer")
	public Customer getCustomer() {
		
		Customer c=new Customer();
		c.setEmail("ram@gmail.com");
		c.setGender("male");
		c.setName("ram");
		return c;
	}

}
