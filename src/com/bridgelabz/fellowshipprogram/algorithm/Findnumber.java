package com.bridgelabz.fellowshipprogram.algorithm;

import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Findnumber {

	public static void main(String[] args) {
		int low=0,high=100,mid;
		while(low<high)
		{
			mid=(low+high)/2;
			System.out.println("Enter 1 if the number is between "+low+"-"+mid);
			System.out.println("Enter 2 if the number is between "+(mid+1)+"-"+high);
			int n=Utility.inputInteger();
			if(n==1)
			{
				high=mid;
			}
			else
			{
				low=(mid+1);
			}
		}
		System.out.println("Guess number is "+low);

	}

}