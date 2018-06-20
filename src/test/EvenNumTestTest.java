package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.EvenNumTest;

public class EvenNumTestTest {

	@Test
	public void testIsEven() {
		EvenNumTest e = new EvenNumTest();
		boolean expected = e.isEven(0);
		assertEquals(expected,true);
		
	}
	@Test
	public void testIsEven1() {
		EvenNumTest e = new EvenNumTest();
		boolean expected = e.isEven(5);
		assertEquals(expected,false);
		
	}

}
