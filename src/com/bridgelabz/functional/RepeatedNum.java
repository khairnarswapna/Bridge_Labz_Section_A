package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class RepeatedNum 
{
	public static void main(String[] args) 
	{
		 
		
		Utility utility = new Utility();
		int a[]= {1,2,3,4,5,6,7,8,9,6};
		int repeatedno;
	
		repeatedno=utility.findRepeatedInArray(a);
		
		System.out.println("Repeated Number is : "+repeatedno);
		
	}

}
