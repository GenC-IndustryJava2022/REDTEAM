package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//@EnableEurekaClient
@SpringBootApplication
//@ComponentScan(basePackages ={"com.cognizant"})
//@EnableJpaRepositories("com.cognizant.repository")
public class CogniClothApplication {


	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(CogniClothApplication.class,args);
				
	}

}
