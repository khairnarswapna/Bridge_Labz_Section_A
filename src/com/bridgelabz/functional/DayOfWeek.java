package com.bridgelabz.functional;
import java.util.*;

import com.bridgelabz.utility.Utility;
public class DayOfWeek 
{
	public static void main(String[] args) 
	{  
		Utility utility = new Utility();
		Scanner sc=new Scanner(System.in);
		int day,month,year,d1;
		boolean leapyr,isValidDate;
		System.out.println("Please Enter Day: ");
		day=sc.nextInt();
		System.out.println("Please Enter Month: ");
		month=sc.nextInt();
		System.out.println("please Enter Year: ");
		year=sc.nextInt();
	    leapyr=utility.leapYear(year);
    	isValidDate=utility.checkValidateDate(month,day,leapyr);
	     if(isValidDate) 
           {
			d1=Utility.caldaysOfMonth(month,leapyr);
			
			switch(d1) 
			{
				case 0:
					System.out.println("Day=>Sunday");
					break;
				case 1:
					System.out.println("Day=>Monday");
					break;
				case 2:
					System.out.println("Day=>Tuesday");
					break;
				case 3:
					System.out.println("Day=>Wednesday");
					break;
				case 4:
					System.out.println("Day=>Thursday");
					break;
				case 5:
					System.out.println("Day=>Friday");
					break;
				case 6:
					System.out.println("Day=>Saturday");
					break;
			}
		}
		else 
		{
			System.out.println("please Enter the Invalid Date");
		}
		
		
	
	}


}