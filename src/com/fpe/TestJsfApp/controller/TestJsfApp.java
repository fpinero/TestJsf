package com.fpe.TestJsfApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.fpe.TestJsf.Domain.Student;

@Controller
@EnableWebMvc
public class TestJsfApp {
	
	@Autowired
	Student student;
	
	@RequestMapping("/")
	public String doThings(Model model){
				
		return("hello-world");
		
	}
	
	@RequestMapping("/form")
	public String doThings2(Model model){
				
		return("student-form");
		
	}
	
	

}
