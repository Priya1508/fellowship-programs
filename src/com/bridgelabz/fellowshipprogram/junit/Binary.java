package com.bridgelabz.fellowshipprogram.junit;
import com.bridgelabz.fellowshipprogram.utility.Utility;
/**
 * Purpose : To give input as decimal and print output in binary. Swap the nibbles and find a new number and check whether it is power of two 
 * @author : Priya Nagare
 * @Date : 05 Dec 2019
 *
 */
public class Binary
{
	public static void main(String[] args)
	{
		System.out.println("Enter a decimal number: ");
		int n=Utility.inputInteger();
		System.out.println("Binary number is: ");
		Utility.toBinary((int) n);
		String binary = null;
		int n1=Utility.swapNibbles(binary, n);
		System.out.println();
		System.out.println("After swapping nibbles: "+n1);
		Utility.ispowerOfTwo(n1);
	}
}
