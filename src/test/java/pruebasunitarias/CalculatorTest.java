package pruebasunitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private final Calculator calculator = new Calculator();
	// solo la quiero para ocupar en esta clase
	@Test
	void addition() {
		assertEquals(8,calculator.addNumbers(5, 3));
	}

	@Test
	void rest() {
		assertEquals(2,calculator.subtractNumbers(5, 3));
	}
	
	@Test
	void multi() {
		assertEquals(15,calculator.multiplyNumbers(5, 3));
	}
	
	@Test
	void div() {
		assertEquals(5,calculator.divideNumbers(15, 3));
	}
	
	
}
