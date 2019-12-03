package com.bridgelabz.fellowshipprogram.basic;

import com.bridgelabz.fellowshipprogram.utility.Utility;
/**
 * Purpose : To check if the given year is leap year or not
 * @author : Priya Nagare
 * @Date 30 Nov 2019
 *
 */

public class Leapyear {

	public static void main(String[] args) {
		System.out.println("Enter year: ");
		int year=Utility.inputInteger();
		Utility.leapYear(year);

	}

}
