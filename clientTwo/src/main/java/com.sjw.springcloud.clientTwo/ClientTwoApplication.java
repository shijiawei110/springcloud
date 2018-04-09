package com.sjw.springcloud.clientTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientTwoApplication.class, args);
	}

}
