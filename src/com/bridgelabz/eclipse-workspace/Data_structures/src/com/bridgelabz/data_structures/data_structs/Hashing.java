package com.bridgelabz.data_structures.data_structs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.ds.utility.Node;
import com.bridgelabz.ds.utility.Utility;

public class Hashing {
    //Create a list of size 11
	Node arr[]=new Node[11];
	public int data1;
	public Node next;
	public void method(int data)
	{
		Node n=new Node();
		//int n=data;
		n.data1=data;
		n.next=null;	
		int index=data%11;
		if(arr[index]==null)
		{
			arr[index]=n;
		}
		else
		{
			//Create a temporary node temp
			Node temp=new Node();
			temp=arr[index];
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
		}
	}
	
	public void display()
	{
		for(int i=0;i<arr.length;i++)
		{
		  Node temp=arr[i];
		  if(temp!=null)
		  {
			  System.out.print("Remainder "+i+" :");
			  while(temp!=null)
			  {
				  System.out.print(temp.data1+" ");
				  temp=temp.next;
			  }
		  }
		  System.out.println();
		}
	}
	
	public void search()
	{
		//Utility u=new Utility();
		System.out.println("enter a number you want to search: ");
		Scanner sc=new Scanner(System.in);
		Node key=new Node();
		
		//int key=sc.nextInt();
		//data1=key;
		//u.pushPop(key);
		for(int i=0;i<arr.length;i++)
		{
			
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		
		//Hashing h=new Hashing();
	
//		FileWriter fw=new FileWriter("/home/admin1/eclipse-workspace/Data_structures/src/hashing.txt");
//		fw.write(77+" "+88+" "+78+" "+68+" "+76+" "+99+" "+98+" "+75+" "+56+" "+75);
//		//fw.flush();
//		
//		fw.close();
//		FileReader fr=new FileReader("/home/admin1/eclipse-workspace/Data_structures/src/hashing.txt");
//		BufferedReader br=new BufferedReader(fr);
//		br.read();
//		br.close();
		Hashing h=new Hashing();
		//h.display();
		h.method(77);
		h.method(88);
		h.method(78);
		h.method(76);
		h.method(77);
		h.method(68);
		h.display();
		h.search();
		}
}
