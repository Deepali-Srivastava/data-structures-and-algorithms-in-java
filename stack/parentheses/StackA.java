/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

package parentheses;

import java.util.EmptyStackException;

public class StackA 
{
    private char[] stackArray;
    private int top;
	
    public StackA()
    {
       	stackArray = new char[10];
    	top = -1;
    }
    
    public StackA(int maxSize)
    {
    	stackArray = new char[maxSize];
    	top=-1;
    }
    public int size()
    {
    	return top+1;
    }

    public boolean isEmpty()
    {
    	return (top==-1);
    }

    public boolean isFull()
    {
    	return (top==stackArray.length-1);
    }

    public void push(char x)
    {
    	if(isFull())
    	{
    		System.out.println("Stack Overflow\n");
    		return;
    	}
    	top=top+1;
    	stackArray[top]=x;
    }

    public char pop()
    {
    	char x;
    	if(isEmpty())
    	{
    		System.out.println("Stack Underflow\n");
    		throw new EmptyStackException();
    	}
    	x=stackArray[top];
    	top=top-1;
    	return x;
    }

    public char peek()
    {
    	if(isEmpty())
    	{
    		System.out.println("Stack Underflow\n");
    		throw new EmptyStackException();
    	}
    	return stackArray[top];
    }


    public void display()
    {
    	int i;
    	
    	System.out.println("top= " + top);

    	if(isEmpty())
    	{
    		System.out.println("Stack is empty");
    		return;
    	}
        System.out.println("Stack is : ");
    	for(i=top; i>=0; i--)
    		System.out.println(stackArray[i] + " ");
    	System.out.println();
    }


}
