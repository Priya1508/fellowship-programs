package com.bridgelabz.data_structures.data_structs;

import com.bridgelabz.ds.utility.Utility;

public class BalancedParentheses 
{
	public static void main(String[] args)
	{
		Utility u = new Utility();
		String str = "(5+6)*(7+8)/(4+3)*(5+6)*(7+8)/(4+3)";
		char ch = 0;
		for (int i = 0; i < str.length(); i++)
		{
			ch = str.charAt(i);
			if (ch == '(') 
			{
				u.push1(ch);
			}
		}
//			else if (ch == ')')
//			{
//				u.pop1();
//			}
//		}
//		if (!u.isEmpty1())
//		{
//			System.out.println("not balanced");
//		} 
//		else if(u.isEmpty1())
//		{
//			System.out.println("balanced");
//		}
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch==')')
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
