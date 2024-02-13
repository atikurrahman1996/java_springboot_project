package com.example.demo2.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo2.model.Coder;
import com.example.demo2.model.Computer;

// Java based configuration > setter injection

@Configuration
public class JavaBeanConfig {

	@Bean
	public Coder coder1(Computer computer) {

		Coder c1 = new Coder();
		c1.setId(101);
		c1.setName("Atik");
		c1.setLanguage("Java and JavaScript");
		c1.setComputer(computer);

		return c1;

	}

	@Bean
	public Computer computer1() {

		Computer computer = new Computer();

		computer.setBrand("AMD");
		return computer;

	}

}


//Java based configuration > Constructor injection

/*
 
 @Bean
	public Coder coder1(Computer computer) {

		Coder c1 = new Coder(101, "Atik" "Java" computer);
		

		return c1;

	}

	@Bean
	public Computer computer1() {

		Computer computer = new Computer("INTEL");

		
	} 
 
 
 */



