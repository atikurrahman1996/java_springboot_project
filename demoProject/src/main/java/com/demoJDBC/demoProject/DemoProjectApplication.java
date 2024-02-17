package com.demoJDBC.demoProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demoJDBC.demoProject.model.Alien;
import com.demoJDBC.demoProject.repository.AlienRepository;

@SpringBootApplication
public class DemoProjectApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(DemoProjectApplication.class, args);
	
	Alien alien1 = context.getBean(Alien.class);
	alien1.setId(111);
	alien1.setName("Israt");
	alien1.setTech("Kotlin");
	
	
	
	AlienRepository repo = context.getBean(AlienRepository.class);
	
	repo.save(alien1);
	
	System.out.println(repo.findAll());
	
	
	}

}

// JDBC API + MySQL Database






