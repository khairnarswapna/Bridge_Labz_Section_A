package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;
import java.util.*;
public class Anagram 
{ 
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		Scanner sc=new Scanner(System.in);
		String str1,str2;
		
		char [] str1Array, str2Array;
		
		System.out.println("Enter first string: ");
		str1=sc.nextLine();
		System.out.println("Enter second string: ");
		str2=sc.nextLine();
		str1Array=str1.toCharArray();
		str2Array=str2.toCharArray();
		if(Utility.StringAnagram(str1Array,str2Array)) 
		{
			System.out.println("Strings are anagram");
		}
		else 
		{
			System.out.println("Strings are not anagram");
		}
		 

	}


}
