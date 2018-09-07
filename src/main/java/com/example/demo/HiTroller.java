package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiTroller {

	@RequestMapping("/hola")
	public String hola() {
		return "HOLA";
	}
	
}
