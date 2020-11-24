package com.javatechie.StringPalindrome;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

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
	  
	  @Test  
	    public void isSeason(){  
	        System.out.println("test case isRotated");  
	        assertEquals("Winter",App.isSeason(1));
	        assertEquals("Winter",App.isSeason(2));
	        assertEquals("Winter",App.isSeason(12));
	        assertEquals("Spring",App.isSeason(3));
	        assertEquals("Spring",App.isSeason(4));
	        assertEquals("Spring",App.isSeason(5));
	        assertEquals("Spring",App.isSeason(3));
	        assertEquals("Summer",App.isSeason(6));
	        assertEquals("Summer",App.isSeason(7));
	        assertEquals("Summer",App.isSeason(8));
	        assertEquals("Autumn",App.isSeason(9));
	        assertEquals("Autumn",App.isSeason(10));
	        assertEquals("Autumn",App.isSeason(11));
	        assertEquals("Invalid",App.isSeason(13));
	        assertEquals("Invalid",App.isSeason(0));
	        
	        
	        
	        
	       }
		@Test
	public void containSum() {
		int n = 5;
		int s=12;
		int []m = {1,2,3,7,5};
		assertEquals(true, app.subarraySum(n,s,m));
	}
	
	@Test
	public void notContainSum() {
		int n = 5;
		int s=11;
		int []m = {1,2,3,7,5};
		assertEquals(false, app.subarraySum(n,s,m));
	}
	
	@Test
	public void maxPathSum1() {
		int []a = {2,3,7,10,12};
		int []b = {1,5,7,8};
		int ans = 35;
		assertEquals(ans, app.maxPathSum(a,b));
	}
	@Test
	public void maxPathSum2() {
		int []a = {1,2,3};
		int []b = {3,4,5};
		int ans = 15;
		assertEquals(ans, app.maxPathSum(a,b));
	}
	@Test
	public void missingNumber1()
	{
		int n = 5,ans=6;
		int []arr = {1,2,3,4,5};
		assertEquals(ans, app.missingNumber(arr,n));
	}
	
	@Test
	public void missingNumber2()
	{
		int n = 5,ans=2;
		int []arr = {0,-10,1,3,-20};
		assertEquals(ans, app.missingNumber(arr,n));
	}
	
	@Test
	public void getSum1()
	{
		int n = 3,ans = 1332;
		int []arr = {1,2,3};
		assertEquals(ans, app.getSum(arr,n));
	}
	@Test
	public void getSum2()
	{
		int n = 2,ans = 33;
		int []arr = {1,2};
		assertEquals(ans, app.getSum(arr,n));
	}
	
	@Test
	public void LCS1()
	{
		String str1 = "abaaa",str2="baabaca";
		List<String> ans = Arrays.asList("aaaa","abaa","baaa");
		assertEquals(ans, app.LCS(str1,str2));
	}
	@Test
	public void LCS2()
	{
		String str1 = "abcbdab",str2="bdcaba";
		List<String> ans = Arrays.asList("bcab","bcba","bdab");
		assertEquals(ans, app.LCS(str1,str2));
	}
	@Test
	public void LCS3()
	{
		String str1 = "abcbdab",str2="pqxprst";
		List<String> ans = Arrays.asList();
		assertEquals(ans, app.LCS(str1,str2));
	}
	@Test
	public void LCS4()
	{
		String str1 = "AGTGATG",str2="GTTAG";
		List<String> ans = Arrays.asList("GTAG","GTTG");
		assertEquals(ans, app.LCS(str1,str2));
	}

	

}