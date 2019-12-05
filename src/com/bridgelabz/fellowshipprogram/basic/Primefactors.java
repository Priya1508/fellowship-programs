package com.bridgelabz.fellowshipprogram.basic;
import com.bridgelabz.fellowshipprogram.utility.Utility;
/**
 * Purpose : Compute the prime factorization of N using brute force.
 * @author : Priya Nagare
 * @Date : 30 Nov 2019
 *
 */
public class Primefactors 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number: ");
		int num=Utility.inputInteger();
		int prime=0;
		Utility.primeFactors(num, prime);
	}
}
