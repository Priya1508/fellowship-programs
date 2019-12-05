package com.bridgelabz.fellowshipprogram.algorithm;
import com.bridgelabz.fellowshipprogram.utility.Utility;

/**
 *Purpose : To check whether the given string is present in the array or not using binary search 
 * @author : Priya Nagare
 * @Date : 02 Nov 2019
 *
 */
public class Binarysearch 
{
	public static void main(String[] args)
	{
		String str[]= {"a","b","c","d","e"};
		//pass a string you want to search in key
		String key="d";
		int first=0,last=str.length-1;
		int mid=(first+last)/2;
		Utility.binarySearch(str, key, first, last, mid);
	}
}
