package com.bridgelabz.data_structures.data_structs;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.bridgelabz.ds.utility.Utility;

public class BankingCashCounter
{
	public static void main(String[] args) 
	{
		int count=0;
		int cash_count=100000;
		
		try {
			label:
			do
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Welcome to ABC Bank");
				System.out.println("Enter 1 to add person");
				System.out.println("Enter 2 to show the available");
				System.out.println("Enter 3 to exit");
				int choice=sc.nextInt();
				//To run the specific choice the user has inserted
				switch(choice)
				{
				case 1:
					//Enqueue is used to insert elements in queue
					Utility.enqueue(count++);
					System.out.println("Adding "+count+" person to the queue");
					System.out.println("Enter 1 to deposit");
					System.out.println("Enter 2 to withdraw");
					int ch=sc.nextInt();
					switch(ch)
					{
					case 1:
						System.out.println("Enter the amount you want to deposit:");
						int amount=sc.nextInt();
						cash_count=cash_count+amount;
					    System.out.println(amount+" deopsited successfully");
						System.out.println("--------THANK YOU VISIT AGAIN------");
						break;
						
					case 2:
						  System.out.println("Enter the amount you want withdraw:");
						  int amount1=sc.nextInt();
						  if(amount1>cash_count)
						  {
							  System.out.println("Cash is not available");
							  continue label;
						  }
						  else
						  {
							  cash_count=cash_count-amount1;
						  }
						  System.out.println(amount1+" successfully withdrawn");
						  System.out.println("--------THANK YOU VISIT AGAIN------");
						  break;
						  
					default:
						System.out.println("Ivalid choice");
						break;
					}
					//Dequeue is used to remove the elements from the queue
					Utility.dequeue();
					System.out.println("Person removed");
					break;
					
				case 2:
					System.out.println("Cash available is "+cash_count);
					break;
					
				case 3:
					System.exit(0);
				}
			}while(cash_count!=0);
		System.out.println("Out of cash");
	}
		catch (InputMismatchException e)
		{
			System.out.println("Enter valid number");
		}
	}
}
