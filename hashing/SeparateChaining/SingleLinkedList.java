/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

package SeparateChaining;

public class SingleLinkedList 
{
	private Node start;
	
	public SingleLinkedList()
	{
	      start=null;
	}
	
	public void displayList()
	{
		Node p;
		if(start==null)
		{
			System.out.println("___");
			return;
		}
		p=start;
		while(p!=null)
		{
			System.out.print(p.info + "  ");
			p=p.link;
		}
		System.out.println();
	}/*End of displayList()*/
	
		
	public studentRecord search(int x) 
	{
		Node p=start;
		while(p!=null)
		{
			if(p.info.getstudentId()==x)
				break;	
			p=p.link;
		}
		if(p==null)
		{
			System.out.println(x + " not found in list");
			return null;
		}
		else
			return p.info;
	}/*End of search()*/

	public void insertInBeginning(studentRecord data)
	{
		Node temp=new Node(data);
		temp.link=start;
		start=temp;
	}
 
	public void deleteNode(int x)  
	{
		if(start==null)
		{
			System.out.println("Value " + x + " not present\n");
			return;
		}
		
		/*Deletion of first node*/
		if(start.info.getstudentId()==x)
		{
			start=start.link;
			return;
		}
		
		/*Deletion in between or at the end*/
		Node p=start;
		while(p.link!=null)
		{
			if(p.link.info.getstudentId()==x)   
				break;	
			p=p.link;
		}
		
		if(p.link==null)
			System.out.println("Value " + x + " not present\n");
		else
			p.link = p.link.link;
	}

}
