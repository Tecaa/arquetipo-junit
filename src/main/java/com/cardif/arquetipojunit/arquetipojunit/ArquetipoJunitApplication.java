package com.cardif.arquetipojunit.arquetipojunit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cardif.arquetipojunit")
public class ArquetipoJunitApplication {

	/* Get the class name to be printed on */
	static Logger log = LogManager.getLogger(ArquetipoJunitApplication.class.getName());


	public static void main(String[] args) {
		log.debug("Iniciando main");
		SpringApplication.run(ArquetipoJunitApplication.class, args);
	}

}
