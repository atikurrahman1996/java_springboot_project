package com.example.demo4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//import org.springframework.web.servlet.ModelAndView;

import com.example.demo4.model.Programmer;

@Controller
public class MainController {
	
	@ModelAttribute
	public void welcome(Model model) {
		model.addAttribute("message", "Welcome to Spring Boot, this message will view every page");
		
	}
	
	
	@RequestMapping("/home")
	public String homePage() {
		
		return "HomePage.html";
	}
	
	@RequestMapping("/addProgrammer")
	public String addProgrammer(@ModelAttribute Programmer programmer) {
		
		return ("ProgrammersInfo.html");

		
		
		
		/*
	//approach 2
		   public ModelAndView addProgrammer(@ModelAttribute Programmer programmer) {
		
		   ModelAndView mv = new ModelAndView();
		   mv.setViewName("ProgrammersInfo.html");

		   return mv;
		 */
	}

}


//Using "ModelAndView" & @ModelAttribute we can simplify the code
// Using String we can reduce the code line

// The @ModelAttribute annotation on the method level can be used to make a model/data globally available to every view/page.
// We use @ModelAttribute annotation on the method level when we want the data would display every page

