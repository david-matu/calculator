package com.dave.devops.demo.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
	
	@Autowired
	private Calculator cal;
	
	@GetMapping("/sum")
	String sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
		return String.valueOf(cal.sum(a, b));
	}
}
