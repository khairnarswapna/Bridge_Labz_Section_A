package com.bridgelabz.functional;
import java.util.*;

import com.bridgelabz.utility.Utility;
public class binary {
	public static void main(String[] args) 
	{
	 
	 
		
		Scanner sc=new Scanner(System.in);
		Utility utility = new Utility();
		int decimal;
		System.out.println("Enter decimal Number");
	    decimal=sc.nextInt();
		String binary=utility.toBinary(decimal);
		System.out.println("Binary cionversion of decimal number"+binary);
	
		
		   String swap=utility.swapNibbles(binary);
		   System.out.println("Numer after swapping nibbles : "+swap);
		   
		   
		    decimal=utility.toDecimal(swap);
		    System.out.println("New decimal Number is : "+decimal);
		        
		    
	}


}
