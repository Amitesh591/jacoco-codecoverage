package com.javatechie.StringPalindrome;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	//pali
	String input1 = "noon";
	App app = new App();
	boolean expected = true;

	@Test
	public void isPlaindromeTest() {
		assertEquals(expected, app.isPalindrome(input1));
	}

	@Test
	public void isNotPlaindromeTest() {
		assertEquals(false, app.isPalindrome("abc"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void isNotPlaindromeExceptionTest() {
		assertEquals(false, app.isPalindrome(null));
	}
	//palirot
	String input2="aab";
	
	@Test
	public void isRotationOfPalindrome() {
		assertEquals(expected, app.isRotationOfPalindrome(input2));
	}

	@Test
	public void isNotRotationOfPalindrome() {
		assertEquals(false, app.isRotationOfPalindrome("abcde"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void isRotationOfPalindromeExceptionTest() {
		assertEquals(false, app.isRotationOfPalindrome(null));
	}

	

}