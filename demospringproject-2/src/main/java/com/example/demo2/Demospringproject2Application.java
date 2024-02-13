package com.example.demo2;

import org.springframework.beans.factory.wiring.BeanConfigurerSupport;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.example.demo2.model.Coder;

@SpringBootApplication
@Import({BeanConfigurerSupport.class})
public class Demospringproject2Application {

	public static void main(String[] args) {
	ApplicationContext context =SpringApplication.run(Demospringproject2Application.class, args);
	
	Coder c1 = (Coder) context.getBean("coder1");
	
	
	System.out.println(c1.getId());
	System.out.println(c1.getName());
	System.out.println(c1.getLanguage());
	System.out.println(c1.getComputer().getBrand());
	
	
	
	}

}

//java based configuration 