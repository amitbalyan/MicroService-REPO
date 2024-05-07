package com.bao.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boa.configuration.AppConfig;
import com.boa.service.HelloWorld;

@SpringBootApplication // Entry Point of your Spring APP
public class SPringMicroServiceCoreBoaApplication {

	public static void main(String[] args) {
	
		ApplicationContext context=SpringApplication.run(AppConfig.class);
		System.out.println("Spring porject is UP set up is ready");
		
		HelloWorld obj=(HelloWorld) context.getBean("helloBean");
		System.out.println(obj.sayHelloWorld("by Amit"));
		
		// Another Service look up 
		// Customer Service 
	}

}
