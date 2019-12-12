package com.bridgelabz.fellowshipprogram.algorithm;

public class String_permutation 
{

	public static void main(String[] args)
	{
		String str="ABC";
		int n=str.length();
		String_permutation permutation=new String_permutation();
		permutation.permute(str,0,n-1);

	}

	private void permute(String str, int first, int last)
	{
		if(first==last)
		{
			System.out.println(str);
		}
		else
		{
			for(int i=first;i<=last;i++)
			{
				str=swap(str,first,i);
				permute(str,first+1,last);
			}
		}
		
	}

	private String swap(String a, int i, int j) {
		char temp;
		
		char[] charArray=a.toCharArray();
		temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);	
	}

}
