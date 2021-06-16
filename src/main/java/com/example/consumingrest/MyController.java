package com.example.consumingrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;


@RestController
public class MyController {
	
	private final String FX_API = "https://api.exchangerate-api.com/v4/latest/USD";
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@GetMapping("/rates")
	public Root getFx() {
		return webClientBuilder.build()
				.get()
				.uri(FX_API)
				.retrieve().bodyToMono(Root.class)
				.block();
	}
}