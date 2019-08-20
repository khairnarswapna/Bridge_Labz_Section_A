package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;
import java.util.*;

public class Calender 
{
	public static void main(String[] args) 
	{ 
		Utility utility = new Utility();
		
		Scanner sc = new Scanner(System.in);
		int month, year,day,days;
		boolean leapYear;
		System.out.println("Please Enter month: ");
		month = sc.nextInt();
		System.out.println("Please Enter Year: ");
		year = sc.nextInt();
		boolean isleap=utility.LeapYrValidation(year);
		if (isleap) 
		{
			leapYear = utility.leapYear(year);
			if (utility.checkValidateDate(month, 1, leapYear)) 
			{
				day = Utility.calDayOfWeek(1, month, year);
				days = Utility.caldaysOfMonth(month, leapYear);
				switch (day) {
				case 0:
					System.out.println("SUN MON TUE WED THU FRI SAT");
					for (int j= 1; j<= days; j++) 
					{
						if (j <= 9) 
						{
							System.out.print(j + "   ");/*three spaces upto 9 digit*/
						} 
						else 
						{
							System.out.print(j + "  ");/*two spaces for more than 10 digits number*/
						}
						if (j% 7 == 0) 
						{
							System.out.println();
						}
					}
					break;
				case 1:
					System.out.println("SUN MON TUE WED THU FRI SAT");
					System.out.print("    ");
					for (int j= 1; j<= days; j++)
					{

						if (j <= 9) 
						{
							System.out.print(j + "   ");
						} else {
							System.out.print(j+ "  ");
						}
						if (j == 6 || j== 13 || j== 20 || j== 27) {
							System.out.println();
						}
					}
					break;
			case 2:
					System.out.println("SUN MON TUE WED THU FRI SAT");
					System.out.print("        ");
					for (int j = 1; j<= days; j++) {

						if( j<= 9) 
						{
							System.out.print(j+ "   ");
						} else 
						{
							System.out.print(j + "  ");
						}
						if (j == 5 || j == 12 || j == 19 || j == 26) 
						{
							System.out.println();
						}
					}
					break;
				case 3:
					System.out.println("SUN MON TUE WED THU FRI SAT");
					System.out.print("            ");
					for (int j = 1; j<= days; j++) 
					{

						if (j<= 9) 
						{
							System.out.print(j+ "   ");
						} 
						else 
						{
							System.out.print(j + "  ");
						}
						if (j== 4 || j== 11 || j == 18 || j == 25) 
						{
							System.out.println();
						}
					}
					break;
				case 4:
					System.out.println("SUN MON TUE WED THU FRI SAT");
					System.out.print("                 ");
					for (int j= 1; j <= days; j++) 
					{

						if (j <= 9) 
						{
							System.out.print(j + "   ");/*three spaces upto 9 digit*/
						} 
						else 
						{
							System.out.print(j + "  ");
						}
						if (j== 3 || j== 10 || j== 17 || j == 24) /*two spaces for more than 10 digits number*/
						{
							System.out.println();
						}
					}
					break;
				case 5:
					System.out.println("SUN MON TUE WED THU FRI SAT");
					System.out.print("                    ");
					for (int j = 1; j<= days; j++) 
					{

						if (j <= 9) 
						{
							System.out.print(j + "   ");
						} 
						else 
						{
							System.out.print(j + "  ");
						}
						if (j == 2 || j == 9 || j == 16 || j == 23 || j== 30) 
						{
							System.out.println();
						}
					}
					break;
				case 6:
					System.out.println("SUN MON TUE WED THU FRI SAT");
					System.out.print("                        ");
					for (int j= 1; j <= days; j++) 
					{

						if (j<= 9) 
						{
							System.out.print(j + "   ");
						} 
						else 
						{
							System.out.print(j + "  ");
						}
						if (j == 1 || j == 8 || j == 15 || j == 22 || j == 29) 
						{
							System.out.println();
						}
					}
					break;
				}

			} 
		else
			System.out.println("Enter valid month");
		} 
		else
			System.out.println("Please enter valid year!!!!!!");
		

	}
					
				

}
