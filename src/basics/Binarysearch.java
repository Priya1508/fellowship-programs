package basics;

import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		System.out.println("Enter a number you want to search: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=arr.length;
		int l=0,r=a,mid;
		for(int i=0;i<a;i++) {
			mid=(l+r)/2;
			if(n==mid) {
				System.out.println("Number found at "+arr[mid]);
				
				 if(n>arr[mid]) {
					l=arr[mid+1];
					
				}
				else {
					r=arr[mid-1];
				}
			}
			
		
		}

	}

}
