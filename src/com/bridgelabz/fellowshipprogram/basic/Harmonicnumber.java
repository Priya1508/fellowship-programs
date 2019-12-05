package com.bridgelabz.fellowshipprogram.basic;
import com.bridgelabz.fellowshipprogram.utility.Utility;
/**
 * Purpose : To print the Nth harmonic number 1/1 + 1/2 + 1/3 + ... + 1/N
 * @author : Priya Nagare
 * @Date : 30 Nov 2019
 *
 */
public class Harmonicnumber 
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number: ");
		float sum=0;
		int num=Utility.inputInteger();
		Utility.harmonicNumber(num, sum);
	}
}
