package com.example.demo3.model;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PreDestroy;

@Component
//@Scope(value= "prototype")      // if you use prototype bean use this
public class Coder {
	
	//public String name;               //if you use prototype bean use this

	@Autowired
	Dog dog;

	public Coder() {

		System.out.println(" Coder calss object created!");

	}

	public void petInfo() {

		dog.info();

	}

	// to destroy created object

	@PreDestroy
	public void destroy() {

		System.out.println(" Coder class object is destroyed....!!");

	}

}
