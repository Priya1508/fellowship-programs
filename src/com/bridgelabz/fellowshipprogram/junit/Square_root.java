package com.bridgelabz.fellowshipprogram.junit;
import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Square_root 
{
	public static void main(String[] args)
	{
		System.out.println("Enter a non negative number: ");
		double n=Utility.inputDouble();
		if(n<0)
		{
			System.out.println("Invalid input");
			n=Utility.inputDouble();
		}
		double sqrt=Utility.sqrt(n);
		System.out.println("Square root is "+sqrt);
	}
}
