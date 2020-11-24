package com.javatechie.StringPalindrome;

/**
 * Hello world!
 *
 */
import java.lang.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.regex.*;

public class App {

	public boolean isPalindrome(String input) {

		if (input == null) {
			throw new IllegalArgumentException("input shouldn't be null");
		}

		if (input.equals(reverse(input))) {
			return true;
		} else {
			return false;
		}
	}
	// Function to check if a given string is a rotation of a 
    // palindrome 
    public boolean isRotationOfPalindrome(String input) 
    { 
    	if (input == null) {
			throw new IllegalArgumentException("input shouldn't be null");
		}
    	
    	// If string iteself is palindrome 
        if (isPalindrome(input)) 
            return true; 
  
        // Now try all rotations one by one 
        int n = input.length(); 
        for (int i = 0; i < n - 1; i++) { 
            String str1 = input.substring(i + 1); 
            String str2 = input.substring(0, i + 1); 
  
            // Check if this rotation is palindrome 
            if (isPalindrome(str1 + str2)) 
                return true; 
        } 
        return false; 
    } 

	private String reverse(String input) {
		String rev = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}
		return rev;
	}
	//cube
	public static int cube(int n){ 
		if(n==0)
			{return 0;}
		else
			{return n*n*n;}  
    }
	//anagram
	 public static boolean anagram(String s1,String s2)
	    {
	        int h1[]=new int[26];
		    int h2[]=new int[26];
		    Arrays.fill(h1,0);
		    Arrays.fill(h2,0);
		    int i;
		    if(s1.length()!=s2.length())
		    {
		        return false;
		    }
		    for(i=0;i<s1.length();i++)
		    {
		        h1[s1.charAt(i)-'a']++;
		    }
		    for(i=0;i<s2.length();i++)
		    {
		        h2[s2.charAt(i)-'a']++;
		    }
		    for(i=0;i<26;i++)
		    {
		        if(h1[i]!=h2[i])
		        {
		            return false;
		        }
		    }
		    return true;
	    }
	 
	 public static boolean isRotated(String s1, String s2){
	        int n = s1.length();
	        if(s1.length() != s2.length())
	        {
	        	return false;
	        }
	        else if( n==1 ) // have to explicitly handle case when size of string is one .
	        {
	        	return s1.equals(s2);
	        }
	        else{
	        	s1 = s1 + s1 ;
	        	if(s1.indexOf(s2) == 2) //for anticlockwise rotation of 2
	        	{
	        		return true;
	        	}
	        	else if(n>1 && s1.indexOf(s2) == n-2) // for clockwise rotation of 2
	        	{
	        		return true ;
	        	}
	        }
	        return false;
	}
	 
	 public static boolean isParanthesis(String expr) 
	    { 
	        // Using ArrayDeque is faster than using Stack class 
	        Deque<Character> stack = new ArrayDeque<Character>(); 
	  
	        // Traversing the Expression 
	        for (int i = 0; i < expr.length(); i++)  
	        { 
	            char x = expr.charAt(i); 
	  
	            if (x == '(' || x == '[' || x == '{')  
	            { 
	                // Push the element in the stack 
	                stack.push(x); 
	                continue; 
	            } 
	  
	            // IF current current character is not opening 
	            // bracket, then it must be closing. So stack 
	            // cannot be empty at this point. 
	            if (stack.isEmpty()) 
	                return false; 
	            char check; 
	            switch (x) { 
	            case ')': 
	                check = stack.pop(); 
	                if (check == '{' || check == '[') 
	                    return false; 
	                break; 
	  
	            case '}': 
	                check = stack.pop(); 
	                if (check == '(' || check == '[') 
	                    return false; 
	                break; 
	  
	            case ']': 
	                check = stack.pop(); 
	                if (check == '(' || check == '{') 
	                    return false; 
	                break; 
	            } 
	        } 
	  
	        // Check Empty Stack 
	        return (stack.isEmpty()); 
	    } 
	 
	 //age problem
	 public static boolean isFit(int age,String cond,int exp) {
		 if(age<=0)
			 return false;
		 if(age>=150)
			 return false;
		 else if(age>0 || age<150)
		 {
			 if(cond.equals("Sick"))
				 return false;
			 else if(cond.equals("Fine"))
				 return true;
			 else if(cond.equals("Average")) {
				 if(exp>0)
					 return true;
				 else
					 return false;
			 }
		 }
		return false;
		 
	 }
	 public static boolean isAlphaNumeric(String str)
	    {
	        
	        String regex = "^(?=.*[a-zA-Z])(?=.*[0-9])[A-Za-z0-9]+$";
	 
	        Pattern pt = Pattern.compile(regex);
	        if (str == null) {
	            return false;
	        }
	 
	       
	        Matcher ma = pt.matcher(str);
	 
	        
	        return ma.matches();
	    }
	 
	

}
