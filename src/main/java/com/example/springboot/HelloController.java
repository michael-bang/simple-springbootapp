package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
        String st = "<html><head><title>Greetings from Spring Boot version 1</title></head>\n";
        st = st + "<body><H1>Greetings from version 2</H1></body></html>";

		return st;
	}

}