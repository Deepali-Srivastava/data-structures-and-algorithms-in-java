/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

package HeaderList;

import java.util.Scanner;

public class HeaderList
{
	private Node head;
	
	public HeaderList()
	{
		head=new Node(0);
	}
	
	public void displayList()
	{
		if(head.link==null)
		{
			System.out.println("List is empty\n");
			return;
		}
		Node p=head.link;
		System.out.println("List is :\n");
		while(p!=null)
		{
			System.out.println(p.info + " ");
			p=p.link;
		}
		System.out.println();
	}/*End of displayList()*/

	public void insertAtEnd(int data)
	{
		Node temp = new Node(data);

		Node p=head;
		while(p.link!=null)
			p=p.link;
		
		p.link=temp;
		temp.link=null;
	}/*End of insertAtEnd()*/

	public void createList()
	{
		int i,n,data;
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Enter the number of nodes : ");
		n=scan.nextInt();
		
		for(i=1; i<=n; i++)
		{
			System.out.println("Enter the element to be inserted : ");
			data=scan.nextInt();
			insertAtEnd(data);	
		}
	}/*End of createList()*/

	public void insertBefore(int data,int x)
	{
		Node temp;
		
		/*Find pointer to predecessor of node containing x*/
		Node p=head;
		while(p.link!=null)
		{
			if(p.link.info==x)
				break;
			p=p.link;
		}
		
		if(p.link==null)
			System.out.println(x + " not present in the list");
		else
		{
			temp=new Node(data);
			temp.link=p.link;
			p.link=temp;
		}
	}/*End of insertBefore()*/		

	public void insertAtPosition(int data,int k)
	{
		Node temp;
		int i;
		
		Node p=head;
		for(i=1; i<=k-1 && p!=null; i++)
			p=p.link;
		
		if(p==null)
			System.out.println("You can insert only upto " + (i-1) + "th position\n\n");
		else
		{
			temp=new Node(data);
			temp.link=p.link;
			p.link=temp;
		}	
	}/*End of insertAtPosition()*/

	public void deleteNode(int data)
	{
		Node p=head;
		while(p.link!=null)
		{
			if(p.link.info==data)   
				break;
			p=p.link;
		}

		if(p.link==null)
			System.out.println(data + "Element %d not found");
		else
			p.link = p.link.link;
	}/*End of deleteNode()*/

	public void reverse()
	{
		Node prev, p, next;
		prev=null;
		p=head.link;
		while(p!=null)
		{
			next=p.link;
			p.link=prev;
			prev=p;
			p=next;
		}
		head.link=prev;
	}/*End of reverse()*/
}
