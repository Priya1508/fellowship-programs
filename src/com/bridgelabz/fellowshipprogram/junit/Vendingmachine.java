package com.bridgelabz.fellowshipprogram.junit;

import com.bridgelabz.fellowshipprogram.utility.Utility;
/**
 * Purpose : To calculate the minimum number of notes as well as the notes to be returned by the vending machine
 * @author : Priya Nagare
 * @Date : 04 Dec 2019
 *
 */
public class Vendingmachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int notes[]= {2000,1000,500,100,50,20,10,5,2,1};
		System.out.println("Enter amount: ");
		int amount=Utility.inputInteger();
		int value=0,total=0;
		Utility.vendingMachine(notes, amount, value, total);

	}

}
