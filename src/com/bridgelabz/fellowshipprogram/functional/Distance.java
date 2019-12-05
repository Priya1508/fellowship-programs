package com.bridgelabz.fellowshipprogram.functional;
import java.util.Scanner;

/**
 * Purpose : Takes two integer command-line arguments x and y and prints the Euclidean distance from the point (x,y) to the origin(0,0).
 * @author : Priya Nagare
 * @Date : 30 Nov 2019
 *
 */
public class Distance
{
	public static void main(String[] args)
	{
		int x,y;
		double distance;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first integer value: ");
		x=sc.nextInt();
		System.out.println("Enter second integer value: ");
		y=sc.nextInt();
		distance=Math.sqrt(x*x+y*y);
		System.out.println(distance);
	}
}
