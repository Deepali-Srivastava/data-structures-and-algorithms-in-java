/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

package deque;

import java.util.NoSuchElementException;

public class DequeA 
{
	private int[] queueArray;
    private int front;
    private int rear;
	
    public DequeA()
    {
       	queueArray = new int[10];
    	front = -1;
    	rear = -1;
    }
    public DequeA(int maxSize)
    {
    	queueArray = new int[maxSize];
    	front = -1;
    	rear = -1;
    }
    public void insertFront(int x)
	{
		if(isFull())
		{
			System.out.println("Queue Overflow");
			return;
		}
		if(front==-1)
		{	
			front=0;
			rear=0;
		}
		else if(front==0)
			front=queueArray.length-1;
		else
			front=front-1;
		queueArray[front]=x;
	}

    public void insertRear(int x)
	{
		if(isFull())
		{
			System.out.println("Queue Overflow");
			return;
		}
		if(front==-1)  
			front=0;
		
		if(rear==queueArray.length-1)  
			rear=0;
		else
			rear=rear+1;
		queueArray[rear]=x;
	}

    public int deleteFront()
	{
		int x;
		if( isEmpty() )
		{
			System.out.println("Queue Underflow");
			throw new NoSuchElementException();
		}
		x=queueArray[front];
		
		if(front==rear) /*only one element*/
		{
			front=-1;
			rear=-1;
		}
		else if(front==queueArray.length-1)
			front=0;
		else
			front=front+1;
		return x;
	}

    public int deleteRear()
	{
		int x;
		if(isEmpty())
		{
			System.out.println("Queue Underflow");
			throw new NoSuchElementException();
		}
		x=queueArray[rear];
		
		if(front==rear) /*only one element*/
		{
			front=-1;
			rear=-1;
		}
		else if(rear==0)
			rear=queueArray.length-1;
		else
			rear=rear-1;
		return x;
	}

    public boolean isFull()
	{
		return ((front==0 && rear==queueArray.length-1) || (front==rear+1));
	}

    public boolean isEmpty()
	{
		return (front==-1);
	}

    public void display()
	{
		int i;
		
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return;
		}
		
		System.out.println("Queue is : ");
		i=front;
		if(front<=rear)
		{
			while(i<=rear)
				System.out.print(queueArray[i++] + " ");
		}
		else
		{
			while(i<=queueArray.length-1)
				System.out.print(queueArray[i++] + " ");
			i=0;
			while(i<=rear)
				System.out.print(queueArray[i++] + " ");
		}
		System.out.println();
	}
}
