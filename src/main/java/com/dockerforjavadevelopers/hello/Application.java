package com.dockerforjavadevelopers.hello;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan
public class Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	//test34gitc

}
