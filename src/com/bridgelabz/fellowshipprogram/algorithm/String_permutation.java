package com.bridgelabz.fellowshipprogram.algorithm;

/**
 * Purpose : To return all the permutations of a string using iterative method and recursive method
 * @author : Priya Nagare
 * @Date : 05 Dec 2019
 *
 */
public class String_permutation 
{
	public static void main(String[] args)
	{
		String str="ABC";
		int n=str.length();
		//Create an object of the class
		String_permutation permutation=new String_permutation();
		permutation.permute(str,0,n-1);
	}
	public void permute(String str, int first, int last)
	{
		if(first==last)
		{
			System.out.println(str);
		}
		else
		{
			for(int i=first;i<=last;i++)
			{
				//swap the string and store in str
				str=swap(str,first,i);
				permute(str,first+1,last);
			}
		}
	}
	public String swap(String a, int i, int j)
	{
		char temp;	
		char[] charArray=a.toCharArray();
		temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);	
	}
}
