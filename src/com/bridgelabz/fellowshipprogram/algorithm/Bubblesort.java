package com.bridgelabz.fellowshipprogram.algorithm;
import com.bridgelabz.fellowshipprogram.utility.Utility;

/**
 * Purpose : To sort the given array using bubble sort
 * @author : Priya Nagare
 * @Date : 02 Nov 2019
 *
 */
public class Bubblesort 
{
	public static void main(String[] args)
	{
		int arr[]= {5,4,6,3,1,2};
		int i=0,j=0;
		System.out.println("Sorted array is: ");
		Utility.bubbleSort(arr, i, j);
	}
}
