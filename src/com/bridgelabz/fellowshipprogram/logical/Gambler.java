package com.bridgelabz.fellowshipprogram.logical;
import com.bridgelabz.fellowshipprogram.utility.Utility;
/**
 * Purpose : Simulate a gambler who takes stake and bets until broke/win.Print number of wins and percentage of win and liss
 * @author : Priya Nagare
 * @Date : 30 Dec 2019
 *
 */
public class Gambler 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter stake: ");
		int stake=Utility.inputInteger();
		System.out.println("Enter trails: ");
		int trails=Utility.inputInteger();
		System.out.println("Enter goal: ");
		int goal=Utility.inputInteger();
		int bets=0,win=0;
		Utility.gambler(stake, trails, goal, bets, win);	
	}
}
