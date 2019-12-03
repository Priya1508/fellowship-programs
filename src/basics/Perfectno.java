package basics;

import java.util.Scanner;

public class Perfectno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(n==sum) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println("not a perfect number");
		}

	}

}
