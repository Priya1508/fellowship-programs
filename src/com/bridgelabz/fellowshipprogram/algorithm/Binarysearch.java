package com.bridgelabz.fellowshipprogram.algorithm;

import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"a","b","c","d","e"};
		String key="d";
		int first=0,last=str.length-1;
		int mid=(first+last)/2;
		Utility.binarySearch(str, key, first, last, mid);

	}

}