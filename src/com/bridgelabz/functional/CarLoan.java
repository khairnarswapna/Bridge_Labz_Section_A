package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class CarLoan 
{
	public static void main(String args[])
	{
		
		 Utility util=new Utility();
		 double principal,years,rate;
 
	
    principal =Double.parseDouble(args[0]);
    years = Double.parseDouble(args[1]);
    rate = Double.parseDouble(args[2]);
    
    double Payment=util.CarPayment(principal,years,rate);
    
    System.out.println("Monthly payment:"+Payment);
   
    
	}
}
