package com.bridgelabz.functional;
import java.util.*;

import com.bridgelabz.utility.Utility;
public class pallindrome 
{ 
	public static void main(String args[])
	{
		Utility utility = new Utility();
		Scanner sc=new Scanner(System.in);
	
		
		System.out.println("Enter String to find palidrome or not");
		String str=sc.next();
		if(!Utility.StringPalindrome(str)) 
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	 
	}

}
