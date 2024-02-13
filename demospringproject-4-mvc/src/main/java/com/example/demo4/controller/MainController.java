package com.example.demo4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	
	@RequestMapping("/home")
	public String homePage() {
		
		return "HomePage.html";
	}
	
	@RequestMapping("/addProgrammer")
	public String addProgrammer(@RequestParam int pId, @RequestParam String pName, 
			@RequestParam String pLang, Model model) {
		
		model.addAttribute("pId", pId);
		model.addAttribute("pName", pName);
		model.addAttribute("pLang", pLang);
		return "ProgrammersInfo.html";
		
		
		/*
	
	    public ModelAndView addProgrammer(@RequestParam int pId, @RequestParam String pName, @RequestParam String pLang) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("pName", pName);
		mv.addObject("pId", pId);
		mv.addObject("pLang", pLang);
		mv.setViewName("ProgrammersInfo.html");

		return mv;
		 */
		
	}

}


//Till now, we can get data in console from home page
//using model & model map we can get data in web from home page to programmer info page ( front end to back end & back end to to front end though Model interface)
// We need to add user data info in ProgrammersInfo page
// Model & ModelMap works same things ( we can use ModelMap instead of Model)
// Lastly we can use ModelAndView as well, this is an another approach but same result


