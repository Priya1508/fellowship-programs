package com.bridgelabz.fellowshipprogram.algorithm;
import java.util.Arrays;

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
		boolean status=false;
		//replace all the whitespace
		String s1=str1.replaceAll("\\s", "");
		String s2=str2.replaceAll("\\s", "");
		//check whether the length of s1 and s2 are equal or not
		if(s1.length()!=s2.length())
		{
			status=false;
		}
		else
		{
			char[] ArrayS1=s1.toLowerCase().toCharArray();
			char[] ArrayS2=s2.toLowerCase().toCharArray();
			//sort the arrays
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status=Arrays.equals(ArrayS1, ArrayS2);
		}
		if(status)
		{
			System.out.println(s1+" and "+s2+" are anagram");
		}
		else
		{
			System.out.println(s1+" and "+s2+" are not anagram");
		}
	}
}
