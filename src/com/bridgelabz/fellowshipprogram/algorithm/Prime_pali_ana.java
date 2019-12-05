package com.bridgelabz.fellowshipprogram.algorithm;
import java.util.Arrays;

import com.bridgelabz.fellowshipprogram.utility.Utility;

/**
 * Purpose : To find the prime number that are anagram and palindrome
 * @author : Priya Nagare
 * @Date : 04 Dec 2019
 *
 */
public class Prime_pali_ana 
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		int n=Utility.inputInteger();
		isPrime(n);
		isPalindrome(n);
		isAnagram(n);
	}
	public static void isPrime(int n)
	{
		int prime=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				prime=1;
				break;
			}
		}
		if(prime==0)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}
	public static void isPalindrome(int n) {
		int originalnumber=n,rev=0,rem;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(originalnumber==rev)
		{
			System.out.println("Number is prime palindrome");
		}
		else
		{
			System.out.println("Number is not prime palindrome");
		}
	}
	public static void isAnagram(int n) 
	{
		System.out.println("Enter another number");
		int n1=Utility.inputInteger();
		boolean status=false;
		//convert the integer into string
		String s1=Integer.toString(n);
		String s2=Integer.toString(n1);
		//replace all the whitespace
		String a=s1.replaceAll("\\s", "");
		String b=s2.replaceAll("\\s", "");
		//check whether the lengths of string a and b are equal or not 
		if(a.length()!=b.length())
		{
			status=false;
		}
		else
		{
			char[] ArrayS1=a.toLowerCase().toCharArray();
			char[] ArrayS2=b.toLowerCase().toCharArray();
			//sort the arrays
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status=Arrays.equals(ArrayS1, ArrayS2);
		}
		if(status)
		{
			System.out.println("Number is anagram");
		}
		else
		{
			System.out.println("Number is not anagram");
		}
	}
}
