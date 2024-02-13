package com.example.demo4.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

//import org.springframework.web.servlet.ModelAndView;

import com.example.demo4.model.Programmer;

@Controller
public class MainController {
	
	@ModelAttribute
	public void welcome(Model model) {
		model.addAttribute("message", "Welcome to Spring Boot, this message will view every page");
		
	}
	
	
	@GetMapping("/home")
	public String homePage() {
		
		return "HomePage.html";
	}
	
	@PostMapping("/addProgrammer")
	public String addProgrammer(@ModelAttribute Programmer programmer) {
		
		
		return ("ProgrammersInfo.html");

	}
	
	// Fetch the data from server> get all programmer data
	
	@GetMapping("/allProgrammer")
	public String allProgrammer(Model model) {
		
		List<Programmer> prog = new ArrayList<Programmer>();
		
		prog.add(new Programmer(101, "Atik",   "JAVA"));
		prog.add(new Programmer(102, "Israt",  "Python"));
		prog.add(new Programmer(103, "Atikur",  "JavaScript"));
		prog.add(new Programmer(104, "Jahan",   "C++"));
		
		model.addAttribute("programmers", prog);
		
		return "AllProgrammer.html";
	}

}




























//By default @Request Mapping accept GET & POST request, now we are going to use GetMapping & PostMapping
// 



