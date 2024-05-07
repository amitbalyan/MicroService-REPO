/**
 * 
 */
package com.boa.service;

import org.springframework.stereotype.Service;

/**
 * @author Dell
 *
 */
@Service
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String sayHelloWorld(String msg) {
		// TODO Auto-generated method stub
		System.out.println("In the Service Method");
		return "Hello World Sevice with Call name-->" +msg;
	}

}
