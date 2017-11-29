package com.example.demotijdensktv.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRest {
	@GetMapping("/ktv")
	public String demofunctie() {
		return "tijdens demo ktv";
	}
}
