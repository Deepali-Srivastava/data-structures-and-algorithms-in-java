/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

package postfix;

import java.util.Scanner;

public class Demo 
{
	public static void main(String[] args) 
	{
		String infix;
			
		Scanner scan = new Scanner(System.in);	
		  
		System.out.print("Enter infix expression : ");
		infix = scan.nextLine();
		
		String postfix = infixToPostfix(infix);
		
		System.out.println("Postfix expression is : " + postfix);
		
		System.out.println("Value of expression : " + evaluatePostfix(postfix));
		
		scan.close();
	}
	
	public static String infixToPostfix(String infix)
	{
		String postfix = new String();
		
		StackChar st = new StackChar(20);
				
		char next,symbol;
		for(int i=0; i<infix.length(); i++)
		{
			symbol=infix.charAt(i);
			
			if(symbol==' ' || symbol=='\t') /*ignore blanks and tabs*/
				continue;
			
			switch(symbol)
			{
				case '(':
					st.push(symbol);
					break;
				case ')':
					while((next=st.pop())!='(')
						postfix = postfix + next;
					break;
				case '+':
				case '-':
				case '*':
				case '/':
				case '%':
				case '^':
					while( !st.isEmpty() &&  precedence(st.peek())>= precedence(symbol) )
						postfix = postfix + st.pop();
					st.push(symbol);
					break;
				default: /*operand*/
				     postfix = postfix + symbol;
			}
		}
		while(!st.isEmpty()) 
			postfix = postfix + st.pop();
		return postfix;
	}
	
	public static int precedence(char symbol)
	{
		switch(symbol)
		{
		case '(':
			return 0;
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
		case '%':
			return 2;
		case '^':
			return 3;
		default :
			return 0;
		}
	}
				
	public static int evaluatePostfix(String postfix)
	{
		StackInt st = new StackInt(20);
		
		int x,y;
		for(int i=0; i<postfix.length(); i++)
		{
			if(Character.isDigit(postfix.charAt(i)))
				st.push(Character.getNumericValue(postfix.charAt(i)));
			else
			{
				x=st.pop();
				y=st.pop();
				switch(postfix.charAt(i))
				{
				case '+':
					st.push(y+x); break;
				case '-':
					st.push(y-x); break;
				case '*':
					st.push(y*x); break;
				case '/':
					st.push(y/x); break;
				case '%':
					st.push(y%x); break;
				case '^':
					st.push(power(y,x));
				}
			}
		}
		return st.pop();
	}

	public static int power(int b,int a)
	{
		int i,x=1;
		for(i=1; i<=a; i++)
			x=x*b;
		return x;
	}
}

