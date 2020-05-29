package com.fujitsu.cloudlab.offerRetriever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fujitsu.cloudlab.commons.exception.ApiErrorHandler;

@SpringBootApplication
@ImportAutoConfiguration({ApiErrorHandler.class})
public class OfferRetrieverApplication {

	public static void main(String[] args) {
		SpringApplication.run(OfferRetrieverApplication.class, args);
	}

}
