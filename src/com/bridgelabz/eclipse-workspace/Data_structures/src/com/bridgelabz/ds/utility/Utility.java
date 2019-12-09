package com.bridgelabz.ds.utility;

import java.util.NoSuchElementException;

public class Utility
{
	public static Node top=null;
	public static Node front=null;
	public static Node rear=null;
	public static Node head=null;
	
	static int size=0;
	//To push the element in the stack
	public static <T> T push(T element)
	{
		Node temp=new Node();
		temp.next=top;
		top=temp;
		return(T)temp.data;
	}
	//To remove the element from the stack
	public static<T> T pop()
	{
		if(top==null)
		{
			throw new NoSuchElementException("Stack is empty");
		}
		T temp=(T)top.data;
		top=top.next;
		return temp;
	}
	//To retrieve the position of the data where the top is present without removing the data
	public static<T> T peek()
	{
		if(top==null)
		{
			throw new NoSuchElementException("Stack is empty");
		}
		System.out.println("Element is "+top.data);
		return (T)top.data;
	}
	//To check if the the stack is empty
	public static boolean isEmpty()
	{
		return top==null;
	}
	//To display the elements 
	public static<T>T display()
	{
		Node temp=top;
		while(top!=null)
		{
			System.out.println(" "+temp.data);
			temp=temp.next;
		}
		System.out.println();
		return null;
	}
   //To find the length of the list
	public int size()
	{
		int count=0;
		Node temp=head;
		while(temp!=null)
		{
			count++;
			temp=temp.next;	
		}
		//System.out.println(count);
		return count;
	}
	//To create an empty list
	public static boolean list()
	{
		return head==null;
	}
	//To add an item at the end of the list if them item is absent
	public static  void add(String item)
	{
		Node node=new Node();
		node.data=item;
		node.next=null;
		
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node temp = head;
			while(temp.next!=null)
			{
				 temp= temp.next;
			}
			temp.next=node;
		}
	}
	//To remove the item from the list if the item is present
	public static void remove(String item)
	{
		Node temp=head;
		Node n1;
		if(head==null)
		{
			System.out.println("Removal is not possible");
		}
		else
		{
			temp=head;
			while(temp.next.next!=null)
			{
				if(temp.next.data.equals(item))
				{
					n1=temp.next;
					temp.next=n1.next;
				}
				temp=temp.next;
			}
		}
	}
	//It is used to search the item in the list and returns it
	public boolean search(String item)
	{
		Node temp = head;
		while(temp.next!=null)
		{
			if(item.equals(temp.data))
			{
				return true;
			}
			temp=temp.next;
		}
		if(item.equals(temp.data))
		{
			return true;
		}
		return false;
	}
	//It gives the index value of the item
	public String indexOf(int index)
	{
		int len=size();
		Node temp=head;
		int count=0;
		while(temp.next!=null)
		{
			if(count==index)
			{
				return(String)temp.data;
			}
			count=count+1;
			temp=temp.next;
		}
		if(len==size())
		{
			return(String)temp.data;
		}
		return "";
	}

}
