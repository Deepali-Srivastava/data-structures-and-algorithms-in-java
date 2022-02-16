/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

package queueLinked;

import java.util.NoSuchElementException;

public class QueueL 
{
	private Node front;
	private Node rear;

	public QueueL()
	{
		front = null;
		rear = null;
	}
	public int size()
	{
		int s=0;
		Node p=front;
		while(p!=null)
		{
			s++;
			p=p.link;
		}
		return s;
	}

	public void insert(int x)
	{
		Node temp;
		temp = new Node(x);
		
		if(front==null)		 /*If Queue is empty*/
			front=temp;
		else
			rear.link=temp;
		rear=temp;
	}

	public int Delete()
	{
		int x;
		if(isEmpty())
		{
			System.out.println("Queue Underflow");
			throw new NoSuchElementException();
		}
		x=front.info;
		front=front.link;
		return x;
	}

	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Queue Underflow");
			throw new NoSuchElementException();
		}
		return front.info;
	}

	public boolean isEmpty()
	{
		return (front==null);
	}

	public void display()
	{
		Node p=front;
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return;
		}

		System.out.println("Queue is : ");
		while(p!=null)
		{
			System.out.print(p.info + " ");
			p=p.link;
		}
		System.out.println();
	}
}
