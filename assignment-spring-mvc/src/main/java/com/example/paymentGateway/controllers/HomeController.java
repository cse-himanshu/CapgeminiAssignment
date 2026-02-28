package com.example.paymentGateway.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import com.example.paymentGateway.User;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home() {
		
		return "index";
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		User user = new User(101, "John", "Punjab");
		model.addAttribute("user",user);
		return "login";
	}
}
