package com.microservices.serverconfig.serverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ServerConfigApplication {

	public static <String> void main(String[] args) {
		SpringApplication.run(ServerConfigApplication.class (java.lang.String) args);
	}

}