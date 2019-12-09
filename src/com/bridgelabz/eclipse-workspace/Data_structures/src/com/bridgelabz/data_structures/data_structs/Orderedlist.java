package com.bridgelabz.data_structures.data_structs;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.ds.utility.Utility1;
/**
 * Purpose : Read a list of numbers from a file and arrange in ascending order in a linked list.Take user input for a number,if found then pop the number out of the list
 *           else insert the number 
 * @author : Priya Nagare
 * @Date : 09 Dec 2019
 *
 */
public class Orderedlist {

	public static void main(String[] args) throws IOException {
		Utility1 list=new Utility1();
		//To read data from file
		FileReader fr=new FileReader("/home/admin1/eclipse-workspace/Data_structures/src/ordered.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		String s="";
	
		while((str=br.readLine())!=null)
		{
			s=str;
		}
		String[] arr=s.split(" ");//To split the array
		int[] arr2=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr2[i]=Integer.parseInt(arr[i]);
		}
		
		System.out.println(Arrays.toString(arr2));
		list.bubbleSort(arr2, 0, 0);//sorting of the elements
		for(int i : arr2)
		{
			//adding element to linked list
			list.insert(i);
		}
		System.out.println();
		list.display();
		System.out.println();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int sc=scan.nextInt();
		boolean bool=list.search(sc);
		if(bool)
		{
			list.pop(sc);
		}
		else
		{
			list.push(sc);
		}
		String m="";
		for(int i=0;i<list.size();i++)
		{
			String x=Integer.toString(list.indexOf(i));
			m=m+x;
			m=m+" ";
		}
		list.display();
		BufferedWriter bw=new BufferedWriter(new FileWriter("/home/admin1/eclipse-workspace/Data_structures/src/ordered.txt"));
		bw.write(m+" ");
		bw.close();

	}

}
