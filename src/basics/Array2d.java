package basics;

import java.util.Scanner;

public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] a=new int[2][2];
		System.out.println("Enter the elements in array: ");
		{
			for(int i=0;i<a.length;i++) 
			{
				for(int j=0;j<a.length;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
		}
		System.out.println("Array is: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
