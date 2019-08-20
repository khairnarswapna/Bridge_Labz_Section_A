package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DoubleOpt {

	public static void main(String[] args) 
	{
		Utility util = new Utility();
		
		 double a,b,c;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the value of a,b,c");
		 a=sc.nextDouble();
		 System.out.println("a"+"="+a);
		 b=sc.nextDouble();
		 System.out.println("b"+"="+b);
		 c=sc.nextDouble();
		 System.out.println("c"+"="+c);
		 
		// res = util.AddNum(n, n2);
		// System.out.println("Result is : " + res);

		 
		  double res=util.CalOpt(a,b,c);
		  double res1=util.calOpt1(a,b,c);
		  double res2=util.calOpt2(a,b,c);
		  double res3=util.calOpt3(a,b,c);
		   
		  System.out.println("a+b*c = " +res);
		  System.out.println("a*b+c =" +res1);
		  System.out.println("c+a/b =" +res2);
		  System.out.println("a%b+c=" +res3);
		  
			
		  
			
		  
		  
		  
		 
		  
		// TODO Auto-generated method stub

	}

}
