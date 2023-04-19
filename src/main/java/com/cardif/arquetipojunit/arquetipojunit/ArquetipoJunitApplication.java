package com.cardif.arquetipojunit.arquetipojunit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArquetipoJunitApplication {

	/* Get the class name to be printed on */
	static Logger log = LogManager.getLogger(ArquetipoJunitApplication.class.getName());


	public static void main(String[] args) {

		log.debug("Hello this is a debug message");
		log.info("Hello this is an info message");
		SpringApplication.run(ArquetipoJunitApplication.class, args);

	}

}
