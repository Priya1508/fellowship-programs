package basics;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int sum=0,rem,product=1;
		
		int temp=n;
		int count=0;
		if(n>0) {
			rem=n%10;
			count++;
			n=n/10;
		}
		int count1=count;
		if(n>0) {
			rem=n%10;
			while(count1>0) {
				product=product*rem;
				count--;
			}
			sum=sum+product;
			n=n/10;
		}
		if(n==sum) {
			System.out.println("Number is armstrong");
		}
		else {
			System.out.println("Not a armstrong number");
		}
       sc.close();
	}

	}


