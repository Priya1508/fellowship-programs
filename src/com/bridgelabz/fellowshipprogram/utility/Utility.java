package com.bridgelabz.fellowshipprogram.utility;
import java.io.PrintWriter;
import java.util.Arrays;
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
	 * Purpose : A library for reading in 2D array of integers,doubles or boolean from standard input and printing them out to standard output
	 * @param Pass the arguments of number of rows and number of columns
	 * @return Print the 2D array
	 */
	public static void arrayTwoD(int row,int col)
	{
		PrintWriter out=new PrintWriter(System.out);
		int arrInt[][]=new int[row][col];
		Double[][] arrDb=new Double[row][col];
		Boolean[][] arrBl=new Boolean[row][col];
		//Take Integer values in array
		System.out.println("Enter the elements in Integer:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arrInt[i][j]=Utility.inputInteger();
			}
		}
		System.out.println();
		System.out.println("Integer 2D array is: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				out.print(arrInt[i][j]+" ");
				out.flush();
			}
			out.println();
		}
			//Take Double values in array
			System.out.println();
			System.out.println("Enter the double values in array: ");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					arrDb[i][j]=Utility.inputDouble();
				}
			}
			System.out.println();
			System.out.println("double 2D array is:");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					out.print(arrDb[i][j]+" ");
					out.flush();
				}
				out.println();
			}
			//Take Boolean values in array
			System.out.println();
			System.out.println("Enter the Boolean values in arrray: ");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					arrBl[i][j]=Utility.inputBoolean();
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("Boolean 2D array is: ");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					out.print(arrBl[i][j]+" ");
					out.flush();
				}
				out.println();
			}
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
	 * Purpose : To calculate the minimum number of notes as well as the notes to be returned by the vending machine
	 * @param : Pass amount as argument
	 * @return Return the minimum number notes and notes to be returned 
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
	
	/**
	 * purpose : To check whether the given key string is present in the array or not
	 * @param  Pass the arguments in the array str 
	 * @param key string argument is passed
	 * @param first gives the initial position of string
	 * @param last gives the end position of string
	 * @param mid gives the middle of the string
	 * @return whether the key string is present or not
	 */
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
	
	/**
	 * Purpose : To sort the given array using insertion sort
	 * @param Array arguments is passes in string str
	 * @return The sorted array
	 */
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
	
	/**
	 * Purpose : To sort the given array using bubble sort
	 * @param Pass the array elements in arr
	 * @return The sorted array
	 */
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
	
	/**
	 * Purpose : To pass an argument date and give the output of the day of that date
	 * @param Pass argument date in d
	 * @param Pass argument month in m 
	 * @param pass argument year in y
	 * @return The day of the date passed
	 */
	public static void dayOfWeek(int d,int m,int y)
	{
		if((d>0 || d<32) && (m>0 || m<13))
		{
			int y1=y-(14-m)/12;
			int x=y1+y1/4-y1/100+y1/400;
			int m1=m+12*((14-m)/12)-2;
			int d1=(d+x+(31*m1)/12)%7;
			switch(d1)
			{
			case 0:
				System.out.println("It's Sunday");
				break;
			case 1:
				System.out.println("It's Monday");
				break;
			case 2:
				System.out.println("It's Tuesday");
				break;
			case 3:
				System.out.println("It's Wednesday");
				break;
			case 4:
				System.out.println("It's Thursday");
				break;
			case 5:
				System.out.println("It's Friday");
				break;
			case 6:
				System.out.println("It's Saturday");
				break;
			}
		}
		else
		{
			System.out.println("Enter valid date/month");
		}
	}
	
	/**
	 * Purpose : To calculate the monthly payment of the principal amount to at a specific rate of interest for a specified year
	 * @param Pass argument of principal amount in P
	 * @param Pass the argument of rate of interest in R
	 * @param Pass the argument of number of year in Y
	 * @return To return the monthly payment the person has to make
	 */
	public static double monthlyPayment(double P,double R,double Y)
	{
		double n=12*Y;
		double r=R/(12*100);
		double payment=(P*r)/(1-Math.pow(1+r, -n));
		return payment;
	}
	
	/**
	 * Purpose : To convert the given decimal number to binary
	 * @param Pass an argument n
	 * @return To return the binary number of the passed argument
	 */
	public static void toBinary(int n)
	{
		int i=0;
		int binary[]=new int[100];
		while(n>0)
		{
			binary[i++]=n%2;
			n=n/2;
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(binary[j]+" ");
		}
	}
	
	/**
	 * Purpose : To swap the nibbles of the binary number 
	 * @return To return a new number after the nibbles are swapped
	 * 
	 */
	public static int swapNibbles(String binary, int n)
	{
		return (((n & 0x0F)<<4) | ((n & 0xF0)>>4));
	}
	
	/**
	 * Purpose : To find whether the new number created after swapping the nibbles is power of two
	 * @return true if the new number n1 is power of two
	 */
	public static void ispowerOfTwo(int n1)
	{
		while(n1!=0)
		{
			if(n1%2==0)
			{
				System.out.println("The resultant number is power of two");
				break;
			}
			else
			{
				System.out.println("The resultant is not power of two");
				break;
			}
		}
	}
	/**
	 * Purpose : To find the roots of the equation a*x*x+b*x+c.
	 * @param To pass the arguments a,b and c
	 * @return The roots of the equation  
	 */
	public static void quadratic(double a,double b,double c) 
	{
		double delta=(b*b)-(4*a*c);
		if(delta>0) 
		{
			double root1=(-b+Math.sqrt(delta))/(2*a);
			double root2=(-b-Math.sqrt(delta))/(2*a);
			System.out.println("First root is: "+root1);
			System.out.println("Second root is :"+root2);
		}
		else 
		{
			System.out.println("Roots are imaginary");
		}
	}
	
	/**
	 * Purpose : To check if the second string is the rearrangement of the first string
	 * @param Pass string arguments in str1 and str2
	 * @return Return whether the strings are anagram or not
	 */
	public static void anagram(String str1,String str2)
	{
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
	
	/**
	 * Purpose : Input number N  and then recursively ask true/false if the number is between a high and a low value and print the final answer
	 * @param Pass an argument n 
	 * @return The number which is guessed by the user
	 */
	public static void findNumber(int n)
	{
		int low=0,high=100,mid;
		while(low<high)
		{
			mid=(low+high)/2;
			System.out.println("Enter 1 if the number is between "+low+"-"+mid);
			System.out.println("Enter 2 if the number is between "+(mid+1)+"-"+high);
			n=Utility.inputInteger();
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
	
	/**
	 * Purpose : To find whether the number is prime or not
	 * @param Pass argument n
	 * @return True if the number is prime 
	 */
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
	
	/**
	 * Purpose : To check whether the prime number is a palindrome or not
	 * @param To pass the argument n
	 * @return True if the number is palindrome
	 */
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
	
	/**
	 * Purpose : To check whether the prime palindrome is anagram to another number
	 * @param Pass another argument n1
	 * @return True if the number is anagram or no
	 */
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
	 /**
	  * Purpose : To find all the prime numbers between 1 to 1000
	  * @return All the prime numbers from 1 to 1000 stored in primeNumber
	  */
	public static void primeNumber()
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
	
	/**
	 * Purpose : Takes two double command-line arguments t and v and prints the wind chill. Use Math.pow(a,b) to compute a*b
	 * @param Pass the arguments for temperature t and wind speed v
	 * @return windchill
	 */
	public static void windChill(double t,double v)
	{
		double windchill=0;
		if(t>50 || v>120 || v<3) 
		{
			System.out.println("Formula is not valid");
		}
		else
		{
			windchill=35.74+(0.6215*t)+((0.4275*t)-35.75)*Math.pow(v, 0.16);
		}
		System.out.println("Temperature is: "+t);
		System.out.println("Speed of wind is: "+v);
		System.out.println("Windchill is: "+windchill);
	}
	
	/**
	 * Purpose :
	 */
	public static double temperatureConvertion(double temp,String t)
	{
		double con;
		if(t.equals("c") || t.equals("C"))
		{
			con =(temp*9/5)+32;
		}
		else if(t.equals("f") || t.equals("F"))
		{
			con=(temp-32)*5/9;
		}
		else
		{
			System.out.println("Enter valid input");
			return 0;
		}
		return con;
	}
	
	/**
	 * Purpose : To find the square root of a non-negative number
	 * @param Pass an argument n
	 * @return Return the square root of the argument passed
	 */
	public static double sqrt(double c)
	{
		double t=c;
		double epsilon=1e-15;
		while(Math.abs(t-c/t)>epsilon*t)
		{
			t=(c/t+t)/2;
		}
		return t;
	}
	
	/**
	 * Purpose : To sort the array list of string
	 * @param Pass the array string argument in str
	 * @return The sorted array
	 */
	public static void sort(String[] str,int low,int high)
	{
		int mid;
		if(low<high)
		{
			mid=(low+high)/2;
			//sort the string str from low position to mid
			sort(str,low,mid);
			//sort the string str from mid+1 position to high
			sort(str,mid+1,high);
			//Merge the sorted array
			merge(str,low,mid,high);
		}
	}
	
	/**
	 * Purpose : To merge the sorted array
	 * @param Pass the array string argument in str
	 * @param Pass the low  position of the array string
	 * @param Pass the middle position of the array string
	 * @param Pass the high position of the array string
	 */
	public static void merge(String str[],int low,int mid,int high)
	{
		//find the size the two subarrays
		int l=mid-low+1;
		int r=high-mid;
		//create temp arrays
		String LeftArray[]=new String[l];
		String RightArray[]=new String[r];
		//copy data to temp arrays
		for(int i=0;i<l;i++)
			LeftArray[i]=str[low+i];
		for(int j=0;j<r;j++)
			RightArray[j]=str[mid+1+j];
		//Initialize the indexes of first and second subarrays
		int i=0,j=0;
		//Initial index of merged subarray
		int k=low;
		while(i<l && j<r)
		{
			if(LeftArray[i].compareTo(RightArray[j])<0)
			{
				str[k]=LeftArray[i];
				i++;
			}
			else
			{
				str[k]=RightArray[j];
				j++;
			}
			k++;
		}
		while(i<l)
		{
			str[k]=LeftArray[i];
			i++;
			k++;
		}
		while(j<r)
		{
			str[k]=RightArray[j];
			j++;
			k++;
		}
	}
}
	
