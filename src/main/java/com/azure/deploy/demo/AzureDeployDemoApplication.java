package com.azure.deploy.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureDeployDemoApplication {

	@GetMapping("/message")
	public String message(){
		return "Congrats Saby ! your application deployed successfully in Azure . !";
	}
	public static void main(String[] args) {
		SpringApplication.run(AzureDeployDemoApplication.class, args);
	}

}
