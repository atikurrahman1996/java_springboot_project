package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.example.demo.model.Coder;

@SpringBootApplication
@ImportResource({"classpath:BeanConfig.xml"})      //<constructor-arg index="0" value="101"></constructor-arg>
public class Demospringproject1Application {

	public static void main(String[] args) {
	ApplicationContext context=SpringApplication.run(Demospringproject1Application.class, args);
		
		Coder c1 = (Coder)context.getBean("coder1");
		
		c1.getId();
		c1.getName();
		c1.getLanguage();
		c1.getComputer();
		
		
		System.out.println(c1.getId());
		System.out.println(c1.getName());
		System.out.println(c1.getLanguage());
		System.out.println(c1.getComputer().getBrand());
		
	}

}



// this is xml based configuration