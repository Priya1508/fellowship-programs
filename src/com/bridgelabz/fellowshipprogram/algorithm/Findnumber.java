package com.bridgelabz.fellowshipprogram.algorithm;
import com.bridgelabz.fellowshipprogram.utility.Utility;

/**
 * Purpose : Input number N  and then recursively ask true/false if the number is between a high and a low value and print the final answer
 * @author : Priya Nagare
 * @Date : 03 Nov 2019
 *
 */
public class Findnumber 
{
	public static void main(String[] args)
	{
		int n=Utility.inputInteger();
		Utility.findNumber(n);
	}
}
