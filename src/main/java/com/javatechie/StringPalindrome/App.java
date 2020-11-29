package com.javatechie.StringPalindrome;

/**
 * Hello world!
 *
 */
import java.lang.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
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
  
        // Check all rotations sequencially 
        int n = input.length(); 
        for (int i = 0; i < n - 1; i++) { 
            String str1 = input.substring(i + 1); 
            String str2 = input.substring(0, i + 1); 
  
            // if current rotation is palindrome 
            if (isPalindrome(str1 + str2)) 
                return true; 
        } 
        return false; 
    } 
    
    // if the string is reversed

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
	 //alphanumeric
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
	 //Season as per month
	 public static String isSeason(int n) {
		 
		 switch (n)  
		    { 
		        case 12: 
		        case 1: 
		        case 2: 
		            return "Winter";
		        case 3: 
		        case 4: 
		        case 5: 
		        	return "Spring";  
		        case 6: 
		        case 7: 
		        case 8: 
		        	return "Summer"; 
		        case 9: 
		        case 10: 
		        case 11: 
		            return "Autumn"; 
		            
		        default: 
		          
		            return "Invalid";
		          
		    } 

		
		 
	 }
// Subarray sum
	 public boolean subarraySum(int n, int s, int[] m) {
        int first = 0;
        int last = 0;

        long result = m[first];

        while (result != s) {
            if (result > s) {
                if (first == last) {
                    last++;
                    first++;
                    if (last >= n) break;
                    result = m[first];
                } else {
                    result -= m[first];
                    first++;
                }
            } else {
                last++;
                if (last < n) {
                    result += m[last];
                } else {
                    break;
                }
            }
        }
        if (result != s) {
            return false;
        } else {
            return true;
        }
    }
	//MaxPathSum
	int maxPathSum(int A[], int B[])
    {
        int l1 = A.length;
        int l2 = B.length;
        int sum1 = 0, sum2 =0, res =0;
    int i=0, j=0;
    
    while(i<l1 && j<l2){
        if(A[i] < B[j]){
            sum1 += A[i++];
        }
        else if(A[i]>B[j]){
            sum2 += B[j++];
        }else{
            res += Math.max(sum1, sum2);
            sum1=0;
            sum2=0;
            while(i<l1 && j<l2 && A[i]==B[j]){
                res+=A[i++];
                j++;
            }
        }
    }
        
        while(i<l1){
            sum1+= A[i++];
        }
        
        while(j<l2){
            sum2+= B[j++];
        }
        
        res += Math.max(sum1, sum2);
        return res;
    }
	//Missing Number
	public int missingNumber(int arr[], int size)
    {
        int shift = segregate (arr, size);
        int arr2[]=new int[size-shift];
        int j=0;
        for(int i=shift;i<size;i++){
            arr2[j]=arr[i];
            j++;
        }
        return findMissingPositive(arr2,j);
    }
	//find Missing Positive
    private int findMissingPositive(int arr[],int size){
        int i;
        for(i=0;i<size;i++){
            if(Math.abs(arr[i])-1<size&&arr[Math.abs(arr[i]) - 1]>0)
            arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
      }
      // Return the first index value at which is positive 
      for(i = 0; i < size; i++)
        if (arr[i] > 0)// 1 is added because indexes start from 0 
          return i+1;
      return size+1;
    }
    // Do segregation
    private int segregate (int arr[], int size)
    {
        int j = 0, i;
        for(i = 0; i < size; i++)
        {
           if (arr[i] <= 0)  
           {
               int temp;
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               j++;  // increment count of non-positive integers 
           }
        } 
        return j;
    }
    public long getSum(int A[],int n){
	   long sum=0;
	   long k=0,l=1;
	   for(int i=0;i<n;i++){
	       k+=l;
	       l*=10;
	       sum+=A[i];
	   }
	   long total=((fact(n-1)*sum*k)%1000000007);
	   return total;
   }
   private long fact(int n){
       if(n==0)
           return 1;
       else
           return n*fact(n-1);
   }
   
   public List<String> LCS(String str1, String str2)
	{
		int m = str1.length();
		int n = str2.length();
		ArrayList<ArrayList<String>> lcs = new ArrayList<ArrayList<String>>();
		HashSet <String> hs = new HashSet<String>();
		/* insert a dummy node since are indices are from 1 */
		lcs.add(new ArrayList<String>());
		/* each entry in the array is an index into the lcs array */
		int solArr[][] = new int[m][n];  
		int col = 0;
		for (int row = 0; row < m; row++)
		{
			for (col = 0; col < n; col++)
			{
				if (str1.charAt(row) == str2.charAt(col))
				{
					ArrayList<String> diagList = null;
					ArrayList<String> leftList = null;
					ArrayList<String> upList = null;
					ArrayList<String> thisList = null;
					int diagLength = 0, leftLength = 0, upLength = 0;
					if (row > 0 && col > 0 && (solArr[row - 1][col - 1] != 0))
					{
						diagList = lcs.get(solArr[row - 1][col - 1]);
					}
					if (col > 0 && (solArr[row][col - 1] != 0))
						leftList =  lcs.get(solArr[row][col - 1]);
					if (row > 0 && (solArr[row - 1][col] != 0))
					upList = lcs.get(solArr[row-1][col]);
					hs.clear();
					if (leftList != null && diagList !=null && leftList.get(0).length() == diagList.get(0).length() + 1)
					{
						for (String str : leftList )
						{
							if (!hs.contains(str) && (!diagList.contains(str + str1.charAt(row))))
							{	
								hs.add(str);
								if (thisList == null)
									thisList = new ArrayList<String>();
								thisList.add(str);
							}
						}
					}
					if (upList != null && diagList != null && upList.get(0).length() == diagList.get(0).length() + 1)
					{
						for (String str : upList)
						{
							if (!hs.contains(str) && (!diagList.contains(str + str1.charAt(row))))
							{	
								hs.add(str);
								if (thisList == null)
									thisList = new ArrayList<String>();
								thisList.add(str);
							}
						}
					}

					if (diagList != null)
					{
						for (String str : diagList)
						{
							if (!hs.contains(str + str1.charAt(row)))
							{	
								hs.add(str + str1.charAt(row));
								if (thisList == null)
									thisList = new ArrayList<String>();
								thisList.add(str + str1.charAt(row));
							}
						}
					}
					if (thisList != null)
					{
						lcs.add(thisList);
						solArr[row][col] = lcs.size() - 1;
					}
					else
					{
						if (leftList != null)
							leftLength = leftList.get(0).length();
						if (upList != null)
							upLength = upList.get(0).length();
						if (diagList != null)
							diagLength = diagList.get(0).length();
						int maxLen  = max(leftLength, upLength, diagLength);
						if (leftLength == 0 && diagLength == 0 && upLength == 0)
						{
							if (!hs.contains(Character.toString(str1.charAt(row))))
							{
								thisList =  new ArrayList<String>();
								hs.add(Character.toString(str1.charAt(row)));
								thisList.add(Character.toString(str1.charAt(row)));
								lcs.add(thisList);
								solArr[row][col] = lcs.size() - 1;
							}
						}
						else if (leftLength == maxLen)
							solArr[row][col] = solArr[row][col-1];
						else if (upLength == maxLen)
							solArr[row][col] = solArr[row-1][col];
						else if (diagLength == maxLen)
							solArr[row][col] = solArr[row-1][col-1];
					}
				}
				else
				{
					if (row == 0 && col == 0)
						continue;
					int upLength = 0, leftLength = 0;
					if (row > 0 && (lcs.get(solArr[row - 1][col]).size() > 0))
						upLength = lcs.get(solArr[row - 1][col]).get(0).length();
					if (col > 0 && (lcs.get(solArr[row][col-1]).size() > 0))
						leftLength = lcs.get(solArr[row][col - 1]).get(0).length();
					if (upLength > leftLength)
						solArr[row][col] = solArr[row - 1][col];
					else if (leftLength > upLength)
						solArr[row][col] = solArr[row][col - 1];
					else 
					{
						ArrayList<String> leftList = null;
						ArrayList<String> upList = null;
						int leftIdx = 0;
						int upIdx = 0;
						if (col > 0 && solArr[row][col-1] != 0)
						{
							leftIdx = solArr[row][col-1];
							leftList =  lcs.get(leftIdx);
						}
						if (row > 0 && solArr[row-1][col] != 0)
						{
							upIdx = solArr[row-1][col];
							upList = lcs.get(upIdx);
						}
						ArrayList<String> thisList = null;
						
						if (upIdx != leftIdx)
						{
							if (leftList != null && upList != null)
							{
								if (leftList.containsAll(upList))
								{
									solArr[row][col] = leftIdx;
									continue;
								}
								else if(upList.containsAll(leftList))
								{
									solArr[row][col] = upIdx;
									continue;
								}
							
							}
							if (leftList != null)
							{
								for (String str : leftList)
								{
										if (thisList == null)
											thisList = new ArrayList<String>();
										thisList.add(str);
								}	
							}
							if (upList != null)
							{
								for (String str : upList)
								{
									if (thisList == null)
										thisList = new ArrayList<String>();
									if (!thisList.contains(str))
										thisList.add(str);
									
								}
							}
							if (thisList!=null)
							{
								lcs.add(thisList);
								solArr[row][col] = lcs.size() - 1;
							}
						}
						else 
							solArr[row][col] = upIdx;
					}
						
				}
			}
		}
		ArrayList<String> fl = lcs.get(solArr[m-1][n-1]);
		String flArr[] = new String[fl.size()];
		fl.toArray(flArr);
		Arrays.sort(flArr);
		LinkedHashSet<String> lms = new LinkedHashSet<String>();
		for (String str : flArr)
		{
			if (!lms.contains(str))
				lms.add(str);
				
		}
		List<String> ans = new ArrayList<String>( lms );
		return ans;
	}
	
	private int max(int a, int b, int c)
	{
		int tmpMax = Math.max(a, b);
		int ret = Math.max(tmpMax, c);
		return ret;
	}

	

}
