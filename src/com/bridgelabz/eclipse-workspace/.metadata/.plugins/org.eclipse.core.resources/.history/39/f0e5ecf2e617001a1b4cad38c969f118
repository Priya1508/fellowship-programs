package com.bridgelabz.fellowshipprogram.functional;
import com.bridgelabz.fellowshipprogram.utility.Utility;
/**
 * Purpose : Takes two double command-line arguments t and v and prints the wind chill. Use Math.pow(a,b) to compute ab.
 * @author : Priya Nagare
 * @Date : 30 Nov 2019
 *
 */
public class Windchill 
{
	public static void main(String[] args) 
	{
		double windchill=0;
		System.out.println("Enter the temperature: ");
		double t=Utility.inputDouble();
		System.out.println("Enter the speed of wind: ");
		double v=Utility.inputDouble();	
		if(t>50 || v>120 || v<3) 
		{
			System.out.println("Formula is not valid");
		}
		else
		{
			windchill=35.74+(0.6215*t)+((0.4275*t)-35.75)*Math.pow(v, 0.16);
		}
		System.out.println("Temperature is: "+t);
		System.out.println("Speed of wind is: "+v);
		System.out.println("Windchill is: "+windchill);
	}
}
