package basics;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.out.println("Enter the number of rows: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),i,j=1,k;
		
		for(i=1;i<=n;i++)
		{
			if(j%2!=0)
			{
				for(k=1;k<=j;k++)
				{
					if(k%2!=0)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print("  ");
					}
				}
			}
			else
			{
				for(k=1;k<=j;k++)
				{
					if(k%2==0)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print("  "); 
					}
				}
			}
			System.out.println();
			if(i<=n/2) {
				j++;
			}
			else {
				j--;
			}
		}
	
  }
}
