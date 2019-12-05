package com.bridgelabz.fellowshipprogram.algorithm;

/**
 * Purpose : To print all the numbers between 0 to 1000
 * @author : Priya Nagare
 * @Date : 02 Dec 2019
 *
 */
public class Primenumber
{
	public static void main(String[] args)
	{
		int i=0,n=0;
		//Take a string variable initialize it to null
		String primeNumber="";
		for(i=0;i<=1000;i++)
		{
			int count=0;
			for(n=i;n>=1;n--)
			{
				if(i%n==0)
				count=count+1;
			}
			if(count==2)
			{
				primeNumber=primeNumber+i+" ";
			}
		}
		System.out.println("Prime numbers between 1 to 1000");
		System.out.print(primeNumber);
	}
}
