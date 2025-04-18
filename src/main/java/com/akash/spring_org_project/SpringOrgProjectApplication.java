package com.akash.spring_org_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringOrgProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOrgProjectApplication.class, args);
	}

	@Bean
	RestTemplate restTemplate() 
	{
		return new RestTemplate();
	}
}
