package com.bridgelabz.functional;
import java.util.*;

public class tempratureConversion 
{
         public static void main(String args[])
         {
        	 
        	 
     		int ch;
     		double tempFah,tempCel;
     	  do {
     		   
     		  Scanner sc=new Scanner(System.in);
     		  System.out.println("menu");
     		  System.out.println("1. Convert Fahrenheit to Celsius : ");
     		  System.out.println("2. Convert Celsius to Fahrenheit :");
     		  System.out.println("Enter your choice");
     		  ch=sc.nextInt();
     			 
     		  switch(ch)
     		  {
     		  case 1:
     			  	 System.out.println("Enter temperature in  Fahrenheit");
     			  	  tempFah=sc.nextDouble();
     			  	  double fahToCel = (tempFah - 32) * 5/9;
                       System.out.println("Fahrenheit to Celsius : "+fahToCel);
     			  break;
     		  case 2:
     			  System.out.println("Enter temperature in Celsius : ");
     			  tempCel=sc.nextDouble();
                   double celToFah = (tempCel * 9/5) + 32;
                   System.out.println("Celsius to Fahrenheit "+celToFah);
     			  break;
     		  }
     		  
     	  }while(ch!=3);
     		
         }
}
