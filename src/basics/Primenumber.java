package basics;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int arraySize=sc.nextInt();
		
		int[] values=new int[arraySize];
		System.out.println("Enter the elements of array: ");
		
		for(int i=0;i<arraySize;i++) {
			values[i]=sc.nextInt();
		}
		System.out.println("***Printing prime numbers***");
		for(int i=0;i<arraySize;i++) {
			if(checkPrime(values[i])) {
				System.out.println(values[i]);
			}
		}

	}
	public static boolean checkPrime(int n) {
		if(n<=1)
			return false;
		int i=2;
		while(i<=n/2) {
			if((n%i)==0)
				return false;
			i++;
		}
		return true;
	}    

}
