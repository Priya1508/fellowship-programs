package basics;

import java.util.Scanner;

public class Sawpnibbles {

	public static void main(String[] args) {
		int binary[]=new int[100];
		int i=0;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal number");
		n=sc.nextInt();
		
		while(n>0)
		{
			binary[i++]=(n%2);
			n=n/2;
		}
		for(int j=i+2;j>=0;j--)
		{
			System.out.print(binary[j]+" ");
		}
		//int num=((n & 0x0F)<<4 | (n & 0xF0));
		//System.out.println("After swapping "+num);

	}

}