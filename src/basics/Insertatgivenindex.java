package basics;

import java.util.Scanner;

public class Insertatgivenindex {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array: ");
		int n=sc.nextInt();
		int arr[]=new int[n+1];
		System.out.println("Enter the elements in array: ");
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print(arr[i]+" ");
		
		System.out.println("Enter the position you want to insert: ");
		int pos=sc.nextInt();
		System.out.println("Enter the element you want to insert: ");
		int x=sc.nextInt();
		
		for(i=(n-1);i>=(pos-1);i--) {
			arr[i+1]=arr[i];
		}
		arr[pos-1]=x;
		
		System.out.println("After inserting");
		for(i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		//System.out.println(arr[n]+" ");
		  
		}

	}
	

