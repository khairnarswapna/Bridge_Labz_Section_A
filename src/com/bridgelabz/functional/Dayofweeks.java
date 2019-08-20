package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Dayofweeks 
{

	 public static void main(String args[])
	 {
       
		    Utility util=new Utility();
		    
		   	int m = Integer.parseInt(args[0]);
	        int d = Integer.parseInt(args[1]);
	        int y = Integer.parseInt(args[2]);
	        
	        int d0=util.CalDayofWeek(m,d,y);	
	        
	        if(d0==0)
	        {
	        	System.out.println("Sunday");
	        }
	        else if(d0==1)
	        {
	        	System.out.println("Monday");
	        }
	        else if(d0==2)
	        {
	        	System.out.println("Tuesday");
	        }
	        else if(d0==3)
	        {
	        	System.out.println("Wednesday");
	        }
	        else if(d0==4)
	        {
	        	System.out.println("Thursday");
	        }
	        else if(d0==5)
	        {
	        	System.out.println("Friday");
	        }
	        else if(d0==6)
	        {
	        	System.out.println("Saturday");
	        }
	        
	        

	 }
}
