/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

package doubleLinkedList;

public class Node
{
	public Node prev;
	public int info;
	public Node next; 
	
	public Node(int i) 
	{
		info=i;
		prev=null;
		next=null;
	}
}
