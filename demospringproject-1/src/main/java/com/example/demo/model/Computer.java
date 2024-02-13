package com.example.demo.model;

import jakarta.annotation.PreDestroy;

public class Computer {
	
	private String brand;

	public Computer() {
		super();
		
		
		System.out.println("NO, arg constructor called from Computer class");
	}

	public Computer(String brand) {
		super();
		this.brand = brand;
		
		System.out.println("ALL, arg constructor called from Computer class");
	}


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@PreDestroy
	public void destroy() {
		
		System.out.println(" Computer class object is destroyed....!!");
		
	}

}
