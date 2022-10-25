package com.nttdata.bootcamp.confServerApplicationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfServerApplicationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfServerApplicationServiceApplication.class, args);
	}

}
