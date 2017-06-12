package com.fpe.TestJsfApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestJsfApp {
	
	@RequestMapping("/")
	public String doThings(Model model){
		
		return("hello-world");
		
	}

}
