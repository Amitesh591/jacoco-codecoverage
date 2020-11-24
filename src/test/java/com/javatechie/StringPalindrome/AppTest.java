package com.javatechie.StringPalindrome;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
	String input3="abba";
	
	@Test
	public void isRotationOfPalindrome() {
		assertEquals(expected, app.isRotationOfPalindrome(input2));
		assertEquals(expected, app.isRotationOfPalindrome(input3));
		assertTrue(app.isRotationOfPalindrome(input2));
	}

	@Test
	public void isNotRotationOfPalindrome() {
		assertEquals(false, app.isRotationOfPalindrome("abcde"));
		//assertFalse(app.isRotationOfPalindrome(input2));
	}

	@Test(expected = IllegalArgumentException.class)
	public void isRotationOfPalindromeExceptionTest() {
		assertEquals(false, app.isRotationOfPalindrome(null));
		 
	}
	
	  @Test  
	    public void CubeTest(){  
	        System.out.println("test case cube");  
	        assertEquals(27,App.cube(3)); 
	       
	        assertEquals(0,App.cube(0));
	        assertEquals(8,App.cube(2));
	        assertEquals(-125,App.cube(-5));
	    }
	  
	  @Test  
	    public void anagramTest(){  
	        System.out.println("test case anagram");  
	        assertEquals(true,App.anagram("aba","aab")); 
	        assertEquals(false,App.anagram("zaba","aab")); 
	        assertEquals(false,App.anagram("aba","ccb")); 
	       
	       
	    }
	  @Test  
	    public void isRotated(){  
	        System.out.println("test case isRotated");  
	        assertEquals(true,App.isRotated("abcde","cdeab"));
	        assertEquals(true,App.isRotated("amazon","onamaz"));
	        assertEquals(false,App.isRotated("zaba","aab"));
	        assertEquals(false,App.isRotated("a","b"));
	        assertEquals(false,App.isRotated("aba","ccb")); 
	       
	       
	    }
	  
	  @Test  
	    public void isParanthesis(){  
	        System.out.println("test case isRotated");  
	        assertEquals(true,App.isParanthesis("([{}])"));
	        assertEquals(false,App.isParanthesis(")[{}])"));
	        assertEquals(false,App.isParanthesis("{[{}])"));
	        assertEquals(false,App.isParanthesis("(}"));
	        assertEquals(false,App.isParanthesis("{)"));
	        assertEquals(true,App.isParanthesis("{}"));
	        assertEquals(false,App.isParanthesis("{]"));
	        assertEquals(false,App.isParanthesis("[}"));
	        assertEquals(false,App.isParanthesis("(]"));
	        
	      
	      
	       
	       
	    }

	

}