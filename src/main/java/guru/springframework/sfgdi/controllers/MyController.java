package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String sayHello() {
		System.out.println("123123");
		return "Hello!!";
	}
	
}
