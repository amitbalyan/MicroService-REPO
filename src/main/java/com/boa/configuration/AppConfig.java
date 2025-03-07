/**
 * 
 */
package com.boa.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.boa.service.HelloWorld;
import com.boa.service.HelloWorldImpl;

/**
 * @author Dell
 *
 */
@Configuration
public class AppConfig {

	@Bean(name="helloBean")
	public HelloWorld helloWorld() {
		
		return new HelloWorldImpl();
	}
}
