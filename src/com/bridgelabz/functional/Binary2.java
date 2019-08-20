package com.bridgelabz.functional;
import java.util.*;

import com.bridgelabz.utility.Utility;
public class Binary2 {
	

	public static void main(String ars[])
	{
		
		Utility utility = new Utility();
		
		int decimalNo, a,decimalToBinary;
		int resultOfSwapNibbles;
		String x = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		decimalNo = sc.nextInt();
		  
		decimalToBinary = decimalNo;
		if (decimalNo > 255) 
		{
			System.out.println("Enter Number between 1 to 255");
		} 
		else 
		{

			while (decimalNo> 0) 
			{
				a = decimalNo % 2;
				x = a + "" + x;
				decimalNo = decimalNo / 2;
			}
			System.out.println("Binary is: " + x);

			resultOfSwapNibbles = utility.SwapNibbles(decimalToBinary);
			System.out.println("Result of Swap Nibbles of binary number: "+resultOfSwapNibbles);
		}
		
	}

}
