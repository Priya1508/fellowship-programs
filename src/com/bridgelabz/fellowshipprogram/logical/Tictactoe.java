package com.bridgelabz.fellowshipprogram.logical;
import com.bridgelabz.fellowshipprogram.utility.Utility;
/**
 * Purpose : Tic-Tac-Toe game is played till either wins or till draw  
 * @author : Priya Nagare
 * @Date : 04 Dec 2019
 *
 */
public class Tictactoe 
{
	public static final int X=1,O=-1;
	public final int Empty=0;
	public int player=X;
	public boolean isEmpty=false;
	int board[][]=new int[3][3];
	//To insert the position of X and O in the board
	public void position(int n)
	{
		if(n<=0 || n>=10)
		{
			System.out.println("Enter valid position");
		}
		if(n>0 || n<10)
		{
			switch(n)
			{
			 case 1:
				 board[0][0]=player;
				 break;
			 case 2:
				 board[0][1]=player;
				 break;
			 case 3:
				 board[0][2]=player;
				 break;
			 case 4:
				 board[1][0]=player;
				 break;
			 case 5:
				 board[1][1]=player;
				 break;
			 case 6:
				 board[1][2]=player;
				 break;
			 case 7:
				 board[2][0]=player;
				 break;
			 case 8:
				 board[2][1]=player;
				 break;
			 case 9:
				 board[2][2]=player;
				 break;
			}
			player=-player;
		}
	}
	//To replace the number with strin X and O
	public String toString()
	{
		StringBuilder sb=new StringBuilder();
		isEmpty=false;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				switch(board[i][j])
				{
				case X:
					sb.append("X");
					break;
				case O:
					sb.append("O");
					break;
				case Empty:
					sb.append(" ");
					isEmpty=true;
					break;
				}
				if(j<2) 
				{
					sb.append("|");
				}
			}
			if(i<2)
			{
				sb.append("\n--------\n");
			}
		}
		return sb.toString();
	}
    //To check of the winner
	public boolean isWin(int player)
	{
		return ((board[0][0]+board[0][1]+board[0][2]==player*3) ||
				(board[1][0]+board[1][1]+board[1][2]==player*3) ||
				(board[2][0]+board[2][1]+board[2][2]==player*3) ||
				(board[0][0]+board[1][0]+board[2][0]==player*3) ||
				(board[0][1]+board[1][1]+board[2][1]==player*3) ||
				(board[0][2]+board[1][2]+board[2][2]==player*3) ||
				(board[0][0]+board[1][1]+board[2][2]==player*3) ||
				(board[0][2]+board[1][1]+board[2][0]==player*3));
	}
	//To display the winner
	public void display()
	{
		if(isWin(X))
		{
			System.out.println("X wins");
			isEmpty=false;
		}
		else if(isWin(O))
		{
			System.out.println("O wins");
			isEmpty=false;
		}
		else
		{
			if(!isEmpty)
			{
				System.out.println("It's a draw");
				isEmpty=true;
			}
		}
	}
	
	public static void main(String[] args) {
		Tictactoe t=new Tictactoe();
		do
		{
			System.out.println(t.player==t.X?"Player X turn" : "Player O turn");
			System.out.print("Enter the position: ");
			int n=Utility.inputInteger();
			t.position(n);
			System.out.println(t.toString());
			System.out.println("\n___________\n");
			t.display();
		}while(t.isEmpty);
	}
}
