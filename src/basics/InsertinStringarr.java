package basics;

import java.util.Scanner;

public class InsertinStringarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; 
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the number of elements in array: "); 
		  int n=sc.nextInt();
		 // char arr[]= {'b','d','s','r'};
	
		  String arr[]=new String[n+1]; 
		  System.out.println("Enter the elements in array: ");
		  for(i=0;i<n;i++) 
		  { 
			  arr[i]=sc.next(); 
			  } 
		  System.out.print(arr[i]+" ");
		  
		  System.out.println("Insert the position you want to insert: "); 
		  int pos=sc.nextInt();
		  System.out.println("Enter the element you want to insert: "); 
		  String x=sc.next();
		  
		  for(i=arr.length-1;i>pos-1;i--)
		  {
			  arr[i]=arr[i-1];
			}
		  arr[pos-1]=x;
		  System.out.print("After inserting:");
		  for(i=0;i<arr.length;i++)
		  {
		  System.out.print(arr[i]+" ");
		  }	

	}

}
