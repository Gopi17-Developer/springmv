package gopi.learning.springmcv.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.service.annotation.GetExchange;

@Controller
public class StudentController {
	
	@ResponseBody
	@GetMapping("/home")
	public String showStudentHomePage() {
		
		return "hello this is the student home page";
	}
	
//	@ResponseBody
	@GetMapping("/homepage")
	public String showHomePage() {
		
		return "showhomepage";
	}
}
