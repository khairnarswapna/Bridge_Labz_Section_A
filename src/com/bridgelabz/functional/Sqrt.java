package com.bridgelabz.functional;
import java.util.*;
public class Sqrt 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
	
		
		
		double epsilon = 1e-15;
        int t = number;
        while(Math.abs((t-number/t)) > epsilon*t) 
            
        	t = ((number/t) + t) / 2; 
        
        System.out.println("value of sqrt"+t);
        
	}
}
