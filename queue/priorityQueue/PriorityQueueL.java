/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

package priorityQueue;

import java.util.NoSuchElementException;

public class PriorityQueueL 
{
	private Node front;
	
	public PriorityQueueL()
	{
		front=null;
	}
	
	public void insert(int element,int elementPriority)
	{
		Node temp,p;
		
		temp = new Node(element,elementPriority);

		/*Queue is empty or element to be added has priority more than first element*/
		if( isEmpty() || elementPriority < front.priority )
		{
			temp.link=front;
			front=temp;
		}
		else
		{
			p=front;
			while( p.link!=null && p.link.priority<=elementPriority )
				p=p.link;
			temp.link=p.link;
			p.link=temp;
		}
	}

	public int Delete()
	{
		int element;
		if(isEmpty())
		{
			System.out.println("Queue Underflow");
			throw new NoSuchElementException();
		}
		else
		{
			element=front.info;
			front=front.link;
		}
		return element;
	}

	public boolean isEmpty()
	{
		return (front==null);
	}

	public void display()
	{
		Node p=front;
		if(isEmpty())
			System.out.println("Queue is empty\n");
		else
		{	
			System.out.println("Queue is :");
			System.out.println("Element  Priority");
			while(p!=null)
			{
				System.out.println(p.info + "         " + p.priority );
				p=p.link;
			}
		}
		System.out.println("");
	}
}
