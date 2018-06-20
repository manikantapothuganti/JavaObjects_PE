package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Powerof4;

public class Powerof4Test {

	@Test
    public void testIsPowerOfFour() {
        Powerof4 pof = new Powerof4();
        boolean expectedValue = true;
        boolean actualValue = pof.power(256);
        assertEquals(expectedValue, actualValue);
    }
    
    @Test
    public void testIsNotPowerOfFour() {
        Powerof4 pof = new Powerof4();
        boolean expectedValue = false;
        boolean actualValue = pof.power(200);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void testCheckForZero() {
        Powerof4 pof = new Powerof4();
        boolean expectedValue = false;
        boolean actualValue = pof.power(0);
        assertEquals(expectedValue, actualValue);
    }
}