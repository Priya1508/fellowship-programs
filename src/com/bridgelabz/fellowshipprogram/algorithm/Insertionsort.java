package com.bridgelabz.fellowshipprogram.algorithm;
import com.bridgelabz.fellowshipprogram.utility.Utility;

/**
 * Purpose : To sort the given array using insertion sort
 * @author : Priya Nagare
 * @Date : 02 Nov 2019
 *
 */
public class Insertionsort
{
	public static void main(String[] args)
	{
		String str[]= {"E","A","C","D","B"};
		int i=0;	
		System.out.println("Sorted array is: ");
		Utility.insertionSort(str, i);
	}
}
