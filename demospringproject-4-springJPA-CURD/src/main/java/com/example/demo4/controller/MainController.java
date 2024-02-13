package com.example.demo4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import org.springframework.web.servlet.ModelAndView;

import com.example.demo4.model.Programmer;
import com.example.demo4.repository.ProgrammerRepo;

@Controller
public class MainController {
	
	@Autowired
	ProgrammerRepo repo;
	
	// GET
	
	@GetMapping("/home")
	public String homePage() {
		
		return "HomePage.html";
	}
	
	//POST
	
	@PostMapping("/addProgrammer")
	public String addProgrammer(@ModelAttribute Programmer programmer) {
		
		repo.save(programmer);   //data will save in database first then view to web
		
		return "redirect:/home";
		

	}
	
	//POST
	
	@PostMapping("/findById")
	public String findById(@RequestParam int pId, Model model) {
		
		Programmer p = repo.getOne(pId);
		
		model.addAttribute("programmer", p);
		
		return "ProgrammersInfo.html";
		
	}
	
	// POST > find by programmers by Language/ Name whatever we want > using Query DSL we can find any entity from the db
	
	@PostMapping("/findByLang")
	public String findByLang(@RequestParam String pLang, Model model) {
		
		List<Programmer> p = repo.findBypLang(pLang);
		
		model.addAttribute("programmers", p);
		
		return "AllProgrammer.html";
		
	}
	
	
	//Update
	
	@PostMapping("/updateProgrammer")
	public String updateProgrammer(@ModelAttribute Programmer programmer) {
		
		Programmer p = repo.getOne(programmer.getpId());
		
		p.setpName(programmer.getpName());
		p.setpLang(programmer.getpLang());
		
		repo.save(p);
		
		return "ProgrammersInfo.html";
		
	}
	

	
	//Delete
	
	@GetMapping("/deleteById")
	public String deleteById(@RequestParam int pId) {
		
		repo.deleteById(pId);
		
		return "redirect:/home";
		
	}
	

}




























//By default @Request Mapping accept GET & POST request, now we are going to use GetMapping & PostMapping
// 



