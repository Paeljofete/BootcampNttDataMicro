package com.nttdata.bootcamp.productservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductServiceController {

	// Obtiene la información del .yml del server port.
	@Value("${server.port}")
	private String port;

	@GetMapping(path = "/port")
	public String getPort() {
		String st = "El puerto del micro es ";

		return st + port;
	}
}
