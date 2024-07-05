package com.dave.devops.demo.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private Calculator cal = new Calculator();
	
	@Test
	public void testSum() {
		assertEquals(10, cal.sum(7, 3));
	}
}
