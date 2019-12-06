package com.bridgelabz.fellowshipprogram.algorithm;
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
		Utility.isPrime(n);
		Utility.isPalindrome(n);
		Utility.isAnagram(n);
	}
}
