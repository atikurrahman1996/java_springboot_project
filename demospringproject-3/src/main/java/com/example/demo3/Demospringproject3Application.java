package com.example.demo3;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import com.example.demo3.model.Coder;

@SpringBootApplication

public class Demospringproject3Application {

	public static void main(String[] args) {
	ApplicationContext context =SpringApplication.run(Demospringproject3Application.class, args);
	
	Coder c1 =  context.getBean(Coder.class);
	
	c1.petInfo();
	
	
	//c1.name = "Atik";
	
	//System.out.println(c1.name);
	
  //Coder c2 =  context.getBean(Coder.class);
  
  //c2.name = "Israt";
  
 // System.out.println(c2.name);
	
	
	
	
	
	}

}

//annotation based configuration > @Autowired (mostly used) 

// By default spring create singleton bean > same object create again and again based on request
// If we need multiple bean we can use > prototype bean > use @Scope(value= "prototype") at the class level under @Component bean