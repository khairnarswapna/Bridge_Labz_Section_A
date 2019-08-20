package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) 
	{
		Utility util=new Utility();
		double n,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextDouble();
		if(n>0)
		{
			res=util.HarmonicNumber(n);
			System.out.println("Harmonic number series from "+res);
			
		}	
		else
		{
			System.out.println("number should be greater than 0");
		}
	 

	}

}
