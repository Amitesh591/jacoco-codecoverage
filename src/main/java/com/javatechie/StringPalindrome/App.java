package com.javatechie.StringPalindrome;

/**
 * Hello world!
 *
 */
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

}
