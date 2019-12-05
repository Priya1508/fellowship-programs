package com.bridgelabz.fellowshipprogram.basic;
import com.bridgelabz.fellowshipprogram.utility.Utility;

/**
 * Purpose : Replace a string with the desired string
 * @author : Priya Nagare
 * @Date : 02 Dec 2019
 *
 */
public class Replace_string
{
	public static void main(String[] args) 
	{
		String str1,str2,str3,str4;
		System.out.println("Enter the string: ");
		str1=Utility.inputString();
		System.out.println("Enter the name you want to replace: ");
		str2=Utility.inputString();
		System.out.println("Enter the name you want to replace with: ");
		str3=Utility.inputString();
		str4=str1.replace(str2, str3);
		System.out.println("New string is: "+str4);
	}
}
