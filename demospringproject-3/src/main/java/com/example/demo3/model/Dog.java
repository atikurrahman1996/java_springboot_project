package com.example.demo3.model;

import org.springframework.stereotype.Component;

import jakarta.annotation.PreDestroy;

@Component
public class Dog {

	public Dog() {                                      // constructor

		System.out.println(" Dog object is created!");

	}

	public void info() {

		System.out.println(" This is a German Sheperd Dog.!");
	}

	@PreDestroy
	public void destroy() {

		System.out.println(" Dog class object is destroyed....!!");

	}

}
