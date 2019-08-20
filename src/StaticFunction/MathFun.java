package StaticFunction;
import java.util.*;

import com.bridgelabz.utility.Utility;

public class MathFun {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Utility utility = new Utility();
		System.out.println("-------MENU----------------");
		System.out.println("Enter\n1.Math Function \n2.square root using newtons method\n3.Calculate prime number\n4.factorial number\n5.calculate future and present value\n6.integer min max value\n7.string min max value\n8.collinear slope and area");
		System.out.println("Enter your choice:");
		int ch= sc.nextInt();
		switch (ch) 
		{
		case 1:
			System.out.println("================Menu of Basic Math Function==========");
			System.out.println("1.harmonic number\n2.sin of angle\n3.cosine of angle\n 4.binary number");
			System.out.println("Enter choice that you have to Perform Operation");
			int ch1=sc.nextInt();
			 
			switch (ch1) 
			{
			case 1:
				System.out.println("Enter number for harmonic number");
				int number = sc.nextInt();
				Utility.PrintHarmonic(number);
				break;
			case 2:
				System.out.println("Enter angle to find sin");
				int angle = sc.nextInt();
		     	double radian = Utility.findRadiun(angle);
		     	double sin = Utility.findSin(radian);
		 		System.out.println("Sin(" + angle + ") = " + sin);
				break;
				
			case 3:
				System.out.println("Enter angle to find cosine");
				int angle2 = sc.nextInt();
			//	double radian2 = Utility.findRadiun(angle2);
			//	double cos = Utility.findSin(radian2);
			//	System.out.println("Cos(" + angle2 + ") = " + cos);
				break;
			case 4:
				
				System.out.println("Enter a number");
				int decimalNumber = sc.nextInt();
			//	System.out.println("Binary is: " + Utility.findBinary(decimalNumber));
				break;
			}
			break;
			
			
		case 2:
			System.out.println("Enter number to find sqrt using newtons method");
			int c = sc.nextInt();
			double epsilon = 1e-15;
		//	System.out.println(Utility.findSquareRootUsingNewtonsMethod(c, epsilon));
			break;
		case 3:
			System.out.println("Enter number to find prime number");
			int no = sc.nextInt();

			if (Utility.isPrime(no))
			{
				System.out.println("number is Prime");
			} else
			{
				System.out.println("Prime is not Prime");
			}
			break;
		case 4:
			System.out.println("Enter number to find factorial");
			int number3 = sc.nextInt();
	     	System.out.println(Utility.CalculateFactorial(number3));
			break;
		case 5:
			System.out.println("Calculate present and future value");
			System.out.println("Enter amount");
			int camount=sc.nextInt();
			System.out.println("Enter interest rate");
			int r=sc.nextInt();
			System.out.println("Enter Year:");
			int t=sc.nextInt();
			t=t*12;
		//	double futureValue=Utility.futureValue(camount, r, t);
	//		double presentValue=Utility.presentValue(camount, r, t);
		//	System.out.println("Future values is: "+futureValue);
		//	System.out.println("Present values is: "+presentValue);;
			break;
		case 6:
			System.out.println("Printing min and max from integer array");
			//min max from integer array
			int [] numArr= {1,6,4,2,5};
	     	int min=Utility.minValue(numArr);
		    System.out.println("Min from array is: "+min);
			int max=Utility.maxValue(numArr);
		     System.out.println("Max from array is: "+max);
			break;
		case 7:
			System.out.println("Printing min and max from string array");
			String[] stra= {"ashwini","Rani","swati","damini","jyostana","pinu"};
		//	String minStr=Utility.minValue(stra);
		//	String maxStr=Utility.maxValue(stra);
		//	System.out.println("Min String from array is: "+minStr);
		//	System.out.println("Max String from array is: "+maxStr);
			break;
		case 8:
			System.out.println("Collinear slope and triangle");
			System.out.println("Enter value of 3 point");
			int x1,y1,x2,y2,x3,y3;
			System.out.println("x1=");
			x1=sc.nextInt();
			System.out.println("y1=");
			y1=sc.nextInt();
			System.out.println("x2=");
			x2=sc.nextInt();
			System.out.println("y2=");
			y2=sc.nextInt();
			System.out.println("x3=");
			x3=sc.nextInt();
			System.out.println("y3=");
			y3=sc.nextInt();
			
			/*if(Utility.checkCollinearUsingSlope(x1, y1, x2, y2, x3, y3)) 
				System.out.println("Points are collinear");
			else 
				System.out.println("Points are non -  collinear");
			if(Utility.checkCollinearUsingArea(x1, y1, x2, y2, x3, y3)) 
				System.out.println("Area of triangle are collinear");
			else 
				System.out.println("Area of triangle are not collinear");*/
			
		}

		 

	}

}