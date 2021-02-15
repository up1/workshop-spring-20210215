package com.example.workshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Random;

@SpringBootApplication
public class WorkshopApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context
				= SpringApplication.run(WorkshopApplication.class, args);
		String[] beans = context.getBeanDefinitionNames();
		for (String bean : beans) {
			System.out.println(bean);
		}
		System.out.println(context.getBeanDefinitionCount());

		// Call GenerateUUIDService
		GenerateUUIDService service
				= context.getBean(GenerateUUIDService.class);
		System.out.println(service.getData());
	}

}
