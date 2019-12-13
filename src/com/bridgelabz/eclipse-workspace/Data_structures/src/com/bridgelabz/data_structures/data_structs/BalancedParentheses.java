package com.bridgelabz.data_structures.data_structs;
import com.bridgelabz.ds.utility.Utility;

public class BalancedParentheses 
{
	public static void main(String[] args)
	{
		Utility u = new Utility();
		String str = ")))))((";
		char ch = 0;
		for (int i = 0; i < str.length(); i++)
		{
			ch = str.charAt(i);
			if (ch == '(' || ch=='{' || ch=='[') 
			{
				//To insert the element
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
					//To remove the element
					u.pop1();
				}
				else
				{
					u.push1(ch);
				}
			}
		}
		//If the stack is empty then the parentheses are balanced
			if(u.isEmpty1()==true)
			{
				System.out.println("Balanced parentheses");
			}
			else
			{
				System.out.println("Parentheses not balanced");
			}
	}
}
