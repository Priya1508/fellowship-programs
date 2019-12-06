package com.bridgelabz.fellowshipprogram.junit;
import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Temperature_convertion 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the temperature in celsius: ");
		double celsius=Utility.inputDouble();
		System.out.println("Enter units: ");
		String a=Utility.singleString();
		Double tempc=Utility.temperatureConvertion(celsius,a);
		System.out.println("Temperature is "+tempc);
	}
}
