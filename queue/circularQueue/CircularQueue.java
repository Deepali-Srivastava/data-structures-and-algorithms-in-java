/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

package circularQueue;
import java.util.NoSuchElementException;

public class CircularQueue 
{
	private int[] queueArray;
	private int front;
	private int rear;
	
	public CircularQueue()
	{
		queueArray = new int[10];
		front=-1;
		rear=-1;
	}
	public CircularQueue(int maxSize)
	{
		queueArray = new int[maxSize];
		front=-1;
		rear=-1;
	}
	public boolean isEmpty()
	{
		return (front==-1);
	}
	public boolean isFull()
	{
		return ((front==0 && rear==queueArray.length-1) || (front==rear+1));
	}

	public void insert(int x)
	{
		if(isFull())
		{
			System.out.println("Queue Overflow\n");
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

	public int Delete()
	{
		if(isEmpty())
		{
			System.out.println("Queue Underflow");
			throw new NoSuchElementException();
		}
		
		int x=queueArray[front];

		if(front==rear) /*queue has only one element*/
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

	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Queue Underflow");
			throw new NoSuchElementException();
		}
		return queueArray[front];
	}

	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return;
		}

		System.out.println("Queue is : ");

		int i=front;
		if(front<=rear)
		{
			while(i<=rear)
				System.out.print(queueArray[i++] + " ");
		}
		else
		{
			while(i<=queueArray.length-1)
				System.out.println(queueArray[i++] + " ");
			i=0;
			while(i<=rear)
				System.out.println(queueArray[i++] + " ");
		}
		System.out.println();
	}

	public int size()
	{
		if(isEmpty())
			return 0;
		if(isFull())
			return queueArray.length;
		
		int i=front;
		int sz=0;
		if(front<=rear)
			while(i<=rear)
			{	
				sz++; 
				i++;
			}
		else
		{
			while(i<=queueArray.length-1)
			{
				sz++;
				i++;
			}
			i=0;
			while(i<=rear)
			{
				sz++;
				i++;
			}
		}
		return sz;
	}
}
