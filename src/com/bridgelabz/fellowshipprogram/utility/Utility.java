package com.bridgelabz.fellowshipprogram.utility;

import java.util.Scanner;
/**
 * 
 * @author Priya Nagare
 * @Date   30/11/2019
 *
 */
public class Utility {
	//Creation of scanner object
	
	static Scanner sc=new Scanner(System.in);
	
	/**
	 * Purpose : static function to check for inputting Integer value
	 * @return Integer of Scanner type
	 */
	public static int inputInteger()
	{
		return(sc.nextInt());
	}
	
	/**
	 * Purpose : static function to check for inputting Boolean value
	 * @return Boolean of Scanner type
	 */
	public static boolean inputBoolean()
	{
		return(sc.nextBoolean());
	}
	
	/**
	 * Purpose: static function to check for inputting Long value
	 * @return Long of Scanner type
	 */
	public static long inputLong()
	{
		return(sc.nextLong());
	}
	
	/**
	 * Purpose : static function to check for inputting Double value
	 * @return Integer of Scanner type
	 */
	public static double inputDouble()
	{
		return(sc.nextDouble());
	}
	
	/**
	 * Purpose : static function to check for inputting string value
	 * @return String of Scanner type
	 */
	public static String inputString()
	{
		return(sc.next());
	}
	
	/**
	 * Purpose : static function to check for inputting single string value
	 * @return String of Scanner type
	 */
	public static String singleString()
	{
		return(sc.nextLine());
	}
	
	/**
	 * Purpose : static function to check for inputting float value
	 * @return Float of Scanner type
	 */
	public static float inputFloat()
	{
		return(sc.nextFloat());
	}
	
	/*
	 * static function to close scanner object
	 */
	public static void closeScanner()
	{
		sc.close();
		
	}
	
	/**
	 * Purpose : To check the probability of occurrence head and tail
	 * @param headres
	 * @param tailres
	 * @param head
	 * @param tail
	 * @param num
	 */
	public static void flipCoin(float headres,float tailres,float head,float tail,int num)
	{
		for(int i=0;i<num;i++) 
		{
			if(Math.random()>0.5)
			{
				head++;
			}
			else 
			{
				tail++;
			}
		
		
		headres=(head/num)*100;
		tailres=(tail/num)*100;
		}
		System.out.println("Count head: "+head);
		System.out.println("Percentage of head: "+headres);
		System.out.println("Count tail: "+tail);
		System.out.println("Percentage of tail: "+tailres);
	}
	
	/**
	 * Purpose : To check if the given year is a leap year or not
	 * @param Passing year as argument
	 * @return It returns the boolean value
	 */
	public static boolean leapYear(int year)
	{
		if(year<999 || year>9999) 
		{
			System.out.println("Enter valid year");
		}
		
		if(year%400==0 || year%4==0 && year%100!=0) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	/**
	 * Purpose : To get the powers of 2 till the given number
	 * @param Passing number as argument
	 * @return It returns the Integer value
	 */
	public static void powerOf2(int num)
	{
		if(num<2 || num>32) 
		{
			System.out.println("Enter number greater than 2 and less than 32");
		}
		else 
		{
			int val=1;
		for(int i=0;i<num;i++)
		{
			val=val*2;
			System.out.println(val);
		}
	  }
   }
	
	/**
	 * Purpose : To generate the harmonic series
	 * @param Passing number as argument
	 * @return It returns the sum integer value
	 */
	public static void harmonicNumber(int num,float sum)
	{
		  for(float i=1;i<num;i++)
		  {
			  sum=sum+(1/i);
			  System.out.println(sum);
		  }
	}
	
	/**
	 * Purpose : To generate the Prime factors of given number
	 * @param Passing number as argument
	 * @return Returns the Integer value
	 */
	public static void primeFactors(int num,int prime)
	{
		for(int i=2;i<num;i++) 
		{
			if(num%i==0) 
			{
				prime=1;
				for(int j=2;j<i/2;j++) 
				{
					if(i%j==0)
					{
						prime=0;
						break;
					}
				}
				if(prime==1) 
				{
					System.out.println(i);
				}
			}
		}
	}
	
	/**
	 * Purpose : A library for reading in 2D arrays of integers,doubles or booleans from standard input and printing them out to standard output 
	 * @param 
	 * @param 
	 */
	public static void array2D(int arr[],int n)
	{
		
		System.out.println("Enter the elements in array: ");
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				arr[i]=n;
			}
		}
		System.out.println("Array ele");
	}
	
	/**
	 * Purpose : A program with cubic running time. Read in N integers and counts the number triplets that sum is exatcly zero
	 * @param Pass the size of array as argument
	 * @return Integers three integers whose is zero
	 */
	public static void sumOfThreeNumberZero(int arr[],int n)
	{
		for(int i=0;i<n-2;i++) 
		{
			for(int j=0;j<n-1;j++) 
			{
				for(int k=0;k<n;k++) 
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						System.out.print(arr[i]);
						System.out.print(" ");
						System.out.print(arr[j]);
						System.out.print(" ");
						System.out.print(arr[k]);
						System.out.print(" ");
						int sum=arr[i]+arr[j]+arr[k];
						System.out.print("="+sum);
						System.out.println();
					}
				}
			}
		}
	}
	
	/**
	 * Purpose : It is the randomness or chance involved and the purpose is to win
	 * @param Passing stake as argument
	 * @param Passing trails as argument
	 * @param Passing goal as argument
	 * @return It returns the count of win, percentage of win and average of bets
	 */
	public static void gambler(int stake,int trails,int goal,int bets,int win)
	{
		for(int i=0;i<trails;i++)
		{
			int cash=stake;
			while(cash>0 && cash<goal)
			{
				bets++;
				if(Math.random()>0.5)
				{
					cash++;
				}
				else 
				{
					cash--;
				}
			}
			if(cash==goal)
			{
				win++;
			}
			System.out.println(win+" win of "+trails);
			System.out.println("Percentage of game "+100.0*win/trails);
			System.out.println("Average of bets "+1.0*bets/trails);
		}
	}
	
	/**
	 * Purpose : To randomly generate numbers
	 * @param Passing array size as argument
	 * @return It returns the randomly generated coupon numbers
	 */
	public static void couponNumber(long arr[])
	{

		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=(int)(Math.random()*1000000000+1000000000);
		}
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]+" ");
		}
	}
	
	/**
	 * @return 
	 * 
	 */
	public static void vendingMachine(int notes[],int amount,int value,int total)
	{
		for(int i=0;i<notes.length;i++) 
		{
			total=amount/notes[i];
			if(total!=0) 
			{
				System.out.println(total+" "+notes[i]);
				
			}
			amount=amount%notes[i];
		}
	}
	
	public static void binarySearch(String str[],String key,int first,int last,int mid)
	{
		mid=(first+last)/2;
		while(first<=last) 
		{
			if(str[mid].compareTo(key)<0) 
			{
				first=mid+1;
			}
			else if(str[mid].equals(key)) 
			{
				System.out.println("Key found at "+mid);
				break;
			}
			else
			{
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last)
		{
			System.out.println("Element not found");
		}
	}
	
	public static void insertionSort(String str[],int i)
	{
		String temp;
		for(i=0;i<str.length;i++)
		{
			temp=str[i];
			int j=i-1;
			while(j>=0)
			{
				if(temp.compareTo(str[j])>0) {
					break;
				}
				str[j+1]=str[j];
				j--;
			}
			str[j+1]=temp;
		}
		for(i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
	}
	
	public static void bubbleSort(int arr[],int i,int j)
	{
		int temp;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
}
