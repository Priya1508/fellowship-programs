package com.bridgelabz.fellowshipprogram.functional;
import com.bridgelabz.fellowshipprogram.utility.Utility;

/**
 * Purpose : To find the roots of the equation (a*x*x)+(b*x)+c
 * @author : Priya Nagare
 * @Date : 30 Nov 2019
 *
 */
public class Quadratic 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the value of A: ");
		int a=Utility.inputInteger();
		System.out.println("Enter the value of B: ");
		int b=Utility.inputInteger();
		System.out.println("Enter the value of C: ");
		int c=Utility.inputInteger();
		Utility.quadratic(a, b, c);
	}
}
