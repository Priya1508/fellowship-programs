package com.bridgelabz.data_structures.data_structs;

import com.bridgelabz.ds.utility.Utility;

public class Calendar {

	public static void main(String[] args) 
	{
		//month Jan=1 to Dec=12
		int month=Integer.parseInt(args[0]);
		//year
		int year=Integer.parseInt(args[1]); 
		
		//Create array of months
		String[] months=
			{
					"","January","February","March","April","May","June","July","August",
					"September","October","November","December"
			};
		
		//Create array of days
		int[] days=
			{
				0,31,28,31,30,31,30,31,31,30,31,30,31
			};
	
		//Check for leap year
		if(month==2 && Utility.isLeapYear(year))
		{
			days[month]=29;
		}
		
		//To print headings
		System.out.println(" "+months[month]+year+" ");
		System.out.print("S  M  T  W  Th  F  S");
		
		//starting day
		int d=Utility.day(month, 1, year);
		
		//printing calendar
		for(int i=0;i<d;i++)
		{
			System.out.println(" ");
		}
		for(int i=1;i<=days[month];i++)
		{
			System.out.printf("%2d ",i);
			if(((i+d)%7==0) || (i==days[month]))
			{
				System.out.println("");
			}
		}
	}
}
