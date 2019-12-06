package com.bridgelabz.fellowshipprogram.algorithm;
import com.bridgelabz.fellowshipprogram.utility.Utility;

/**
 * Purpose : To do merge sort of list of strings
 * @author : Priya Nagare
 * @Date : 06 Dec 2019
 *
 */
public class Merge_sort 
{
	public static void main(String[] args) 
	{
		String str[]= {"B","C","E","A","D"};
		int low=0,high=str.length-1;
		int mid=(low+high)/2;
        Utility.sort(str, low, high);
        Utility.merge(str, low, mid, high);
		System.out.println("Sorted array is: ");
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
	}
}
