package com.eray.bitcoinAPI;

import com.eray.bitcoinAPI.exception.RestTemplateResponseErrorHandler;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BitcoinApiApplication {

	private final RestTemplateResponseErrorHandler restTemplateResponseErrorHandler;

	public BitcoinApiApplication(RestTemplateResponseErrorHandler restTemplateResponseErrorHandler) {
		this.restTemplateResponseErrorHandler = restTemplateResponseErrorHandler;
	}
	public static void main(String[] args) {
		SpringApplication.run(BitcoinApiApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){

		return new RestTemplateBuilder().errorHandler(restTemplateResponseErrorHandler).build();
	}
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Bitcoin API")
						.version("1.0")
						.description("Enter bitcoin with currency first and the currency you want to see the equivalent in.\n" +
								"example(EURUSDT)")
						.license(new License().name("Eray Nacarlı Bitcion API Licence")));
	}

}

