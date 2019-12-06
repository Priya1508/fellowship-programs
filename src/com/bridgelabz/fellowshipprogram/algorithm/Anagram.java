package com.bridgelabz.fellowshipprogram.algorithm;
import com.bridgelabz.fellowshipprogram.utility.Utility;

/**
 * Purpose : To check if the second string is the rearrangement of the first string
 * @author : Priya Nagare
 * @Date : 02 Nov 2019
 *
 */
public class Anagram 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the first string: ");
		String str1=Utility.inputString();
		System.out.println("Enter the second string: ");
		String str2=Utility.inputString();
		Utility.anagram(str1, str2);
	}
}
