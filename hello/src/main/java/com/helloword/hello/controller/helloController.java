package com.helloword.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")

public class helloController {

	@GetMapping ("/get1")
	public String hello() {
		return "Hello Generation";
	}
	@GetMapping ("/get2")
	public String hello2() {
		
		return "Metas e objetivos para essa semana: "
				+ "\nQuero pegar essa parte de Spring, admito que estou com medo kk";
	}
}
