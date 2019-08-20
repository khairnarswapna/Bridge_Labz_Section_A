package com.bridgelabz.functional;

public class Trig 
{
	 public static void main(String[] args) 
	    {
	    	 
	        double degrees = Double.parseDouble(args[0]);
	        double radian = Math.toRadians(degrees);

	        double s = Math.sin(radian);
	        System.out.println("sin(" + degrees + ") = " + s);

	        double c = Math.cos(radian);
	        System.out.println("cos(" + degrees + ") = " + c);

	
	        double t = Math.tan(radian);
	        System.out.println("tan(" + degrees + ") = " + t);
	        System.out.println(s + " / " + c + " = " + s / c);

	        double r = s*s + c*c;
	        System.out.println(s*s + " + " + c*c + " = " + r);
	        
	    }
	 
}
