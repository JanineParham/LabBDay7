package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.GenericClass;

class GenericClassTest {
	
	GenericClass<String> name; 
	
	@BeforeEach
	void setUp() {
		name = new GenericClass<>();
	}
	
	@Test
	void testGetValue() {
		String testName = "Janine";
		assertEquals("Janine", name.getValue(testName));
	}

}
