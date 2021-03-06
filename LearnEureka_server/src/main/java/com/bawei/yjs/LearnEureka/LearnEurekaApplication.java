package com.bawei.yjs.LearnEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LearnEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnEurekaApplication.class, args);
	}
}
