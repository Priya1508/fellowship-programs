package com.bridgelabz.fellowshipprogram.basic;

import com.bridgelabz.fellowshipprogram.utility.Utility;
/**
 * Purpose : Flip coin and print percentage of head tail.
 * @author : Priya Nagare
 * @Date : 30 Nov 2019
 *
 */

public class Flipcoin {

	public static void main(String[] args) {
		System.out.println("flip coin number of times: ");
		float headres=0,tailres=0,head=0,tail=0;
		int num=Utility.inputInteger();
		Utility.flipCoin(headres, tailres, head, tail, num);

	}

}