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
		System.out.println("Enter the temperature: ");
		double t=Utility.inputDouble();
		System.out.println("Enter the speed of wind: ");
		double v=Utility.inputDouble();	
		Utility.windChill(t, v);
	}
}
