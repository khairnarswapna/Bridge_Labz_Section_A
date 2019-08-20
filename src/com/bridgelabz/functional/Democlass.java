package com.bridgelabz.functional;

import com.bridgelabz.utility.*;
import java.util.*;

public class Democlass 
{
	public static void main(String args[]) 
	{
		Utility utility = new Utility();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int n = sc.nextInt();
		int res;
		System.out.println("Enter the no");
		int n2 = sc.nextInt();

		res = utility.AddNum(n, n2);
		System.out.println("Result is : " + res);

	}
}
