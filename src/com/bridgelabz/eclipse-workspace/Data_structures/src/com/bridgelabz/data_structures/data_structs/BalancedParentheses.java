package com.bridgelabz.data_structures.data_structs;
import com.bridgelabz.ds.utility.Utility;

public class BalancedParentheses 
{
	public static void main(String[] args)
	{
		Utility u = new Utility();
		String str = "()}{[";
		char ch = 0;
		for (int i = 0; i < str.length(); i++)
		{
			ch = str.charAt(i);
			if (ch == '(' || ch=='{' || ch=='[') 
			{
				u.push1(ch);
			}
		}
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch==')' || ch=='}' || ch==']')
			{
				if(u.isEmpty1()==false)
				{
					u.pop1();
				}
				else
				{
					u.push1(ch);
				}
			}
		}
			if(u.isEmpty1()==true)
			{
				System.out.println("balanced");
			}
			else
			{
				System.out.println("Not balanced");
			}
	}
}
