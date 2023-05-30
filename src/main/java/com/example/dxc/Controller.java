package com.example.dxc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/welcome")	
	public String Home() {
		
		return "Hey Satya! THIS IS THE EXAMPLE OF CI/CD PIPELINE AND CREATE A DOCKER IMAGE ";
	}
	@RequestMapping("/welcome1")	
	public String Home1() {
		
		return "Hey Satya! Welcome to the NEW COMMIT MASSAGE OF THE GITHUB";
	}

}
