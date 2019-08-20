package com.bridgelabz.functional;
import java.util.*;
public class FlipCoin 
{
	public  void flipCoin(int noOftimes) 
	{
		int countHead = 0, countTail = 0;
		float percentH, percentT;
		Random random = new Random();
		
		for (int i = 0; i < noOftimes; i++)
		{
			if (random.nextInt() < 0.5) 
			{
				System.out.println("Tail");
				countTail++;
			} 
			else
			{
				System.out.println("Head");
				countHead++;
			}
		}
		// Calculating percentage
		percentH = (countHead * 100) / noOftimes;
		percentT = (countTail * 100) / noOftimes;
		System.out.println("Percentage of Tail=" + percentT
				+ "\nPercentage of Head=" + percentH);
	}
	public static void main(String[] args) 
	{
		FlipCoin t1 = new FlipCoin();
		Scanner sc = new Scanner(System.in);
		int input;
	
		System.out.println("Enter how many times you want to filp coin");
		input = sc.nextInt();
		
		if(input > 0)
			t1.flipCoin(input);
		else 
			System.out.println("Invalid input");
	}
}
