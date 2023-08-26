package com.myacuity.techchallengecicdapi;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
public class TechChallengeCiCdApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechChallengeCiCdApiApplication.class, args);
		log.info("""

				-------------------------------------------------------
				\tSwagger UI: http://localhost:8080/swagger-ui/index.html
				-------------------------------------------------------
				""");
	}

}
