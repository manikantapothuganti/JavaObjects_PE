package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.PalindromeCheck;

public class PalandromeTest {

	@Test
	public void testIsPalindrome() {
		   String expectedValue= "Palindrome. Sum greater than 25";
	       PalindromeCheck pc=new PalindromeCheck();
	       //Act
	       String actualValue=pc.isPalindrome("24466442");
	       //Assert
	       assertEquals(expectedValue, actualValue);
	    }

	@Test
	public void testIsNotPalindrome() {
		   String expectedValue= "Not a palindrome";
	       PalindromeCheck pc=new PalindromeCheck();
	       //Act
	       String actualValue=pc.isPalindrome("1234");
	       //Assert
	       assertEquals(expectedValue, actualValue);
	    }
	
	
	@Test
	public void testInvalidInput() {
		   String expectedValue= "Not a palindrome";
	       PalindromeCheck pc=new PalindromeCheck();
	       //Act
	       String actualValue=pc.isPalindrome("123321ab");
	       //Assert
	       assertEquals(expectedValue, actualValue);
	    }
	
	@Test
	public void testNullInvalidInput() {
		   String expectedValue= "Invalid Input";
	       PalindromeCheck pc=new PalindromeCheck();
	       //Act
	       String actualValue=pc.isPalindrome(null);
	       //Assert
	       assertNull(actualValue);
	    }
	
	

}
