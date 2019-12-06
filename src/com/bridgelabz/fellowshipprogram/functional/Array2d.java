package com.bridgelabz.fellowshipprogram.functional;
import com.bridgelabz.fellowshipprogram.utility.Utility;

/**
 * Purpose : A library for reading in 2D arrays of integers,doubles or booleans from standard input and printing them out to standard output.
 * @author : Priya Nagare
 * @Date : 06 Dec 2019
 *
 */
public class Array2d 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number of rows:");
		int row=Utility.inputInteger();
		System.out.println("Enter the number of columns: ");
		int col=Utility.inputInteger();
		Utility.arrayTwoD(row, col);
	}
}
