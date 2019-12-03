package com.bridgelabz.fellowshipprogram.functional;

import com.bridgelabz.fellowshipprogram.utility.Utility;
/**
 * Purpose : To find the roots of the equation (a*x*x)+(b*x)+c
 * @author : Priya Nagare
 * @Date : 30 Nov 2019
 *
 */

public class Quadratic {

	public static void main(String[] args) {
		
		double delta,root1,root2;
		
		System.out.println("Enter the value of A: ");
		int a=Utility.inputInteger();
		
		System.out.println("Enter the value of B: ");
		int b=Utility.inputInteger();
		
		System.out.println("Enter the value of C: ");
		int c=Utility.inputInteger();
		
		delta=(b*b)-(4*a*c);
		
		if(delta>0) {
			root1=(-b+Math.sqrt(delta))/(2*a);
			root2=(-b-Math.sqrt(delta))/(2*a);
			System.out.println("First root is: "+root1);
			System.out.println("Second root is :"+root2);
		}
		else {
			System.out.println("Roots are imaginary");
		}
	 
	}

}
