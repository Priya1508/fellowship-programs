package basics;

import java.util.Scanner;

public class Sumofthreenumzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements in array: ");
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//System.out.print(arr[i]+" ");
		
		for(i=0;i<n-2;i++) {
			for(j=0;j<n-1;j++) {
				for(k=0;k<n;k++) {
					if(arr[i]+arr[j]+arr[k]==0) {
						
						
						int sum=arr[i]+arr[j]+arr[k];
						System.out.println(sum);
						System.out.print(arr[i]+" "+arr[j]+" "+arr[k]+" =0");
					}
				}
			}
		}

	}

}
