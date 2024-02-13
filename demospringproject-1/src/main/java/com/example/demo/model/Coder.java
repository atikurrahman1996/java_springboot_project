package com.example.demo.model;

import jakarta.annotation.PreDestroy;

public class Coder {

	private int id;

	private String name;

	private String language;

	private Computer computer;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	public Coder() {
		super();
		System.out.println("NO, arg constructor called from Coder class");
	}

	public Coder(int id, String name, String language, Computer computer) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.computer = computer;
		
		System.out.println("ALL, arg constructor called from Coder class");
	}
	
	// to destroy created object
	
	@PreDestroy
	public void destroy() {
		
		System.out.println(" Coder class object is destroyed....!!");
		
	}

}
