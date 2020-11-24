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
	        System.out.println("test case isParenthesis");  
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
	  
	  @Test  
	    public void isFit(){  
	        System.out.println("test case isFit");  
	        assertEquals(false,App.isFit(0,"Sick",1));
	        assertEquals(false,App.isFit(160,"Sick",1));
	        assertEquals(false,App.isFit(40,"Sick",1));
	        assertEquals(true,App.isFit(40,"Fine",1));
	        assertEquals(true,App.isFit(40,"Average",1));
	        assertEquals(false,App.isFit(40,"Average",0));
	        assertEquals(false,App.isFit(40,"AverageA",0));
	       
	        
	       }
	  
	  @Test  
	    public void isAlphaNumeric(){  
	        System.out.println("test case isRotated");  
	        assertEquals(true,App.isAlphaNumeric("amitesh123"));
	        assertEquals(false,App.isAlphaNumeric("amiteshsujindar"));
	        assertEquals(false,App.isAlphaNumeric(null));
	        assertEquals(false,App.isAlphaNumeric("amitesh123@"));
	        assertEquals(false,App.isAlphaNumeric("123"));
	        assertEquals(false,App.isAlphaNumeric("@#"));
	        
	        
	       
	        
	       }

	

}