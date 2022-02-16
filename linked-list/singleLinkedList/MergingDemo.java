/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

package singleLinkedList;

public class MergingDemo 
{
	public static void main(String[] args) 
	{
		SingleLinkedList list1 = new SingleLinkedList();
		SingleLinkedList list2 = new SingleLinkedList();
				
		list1.createList();
		list2.createList();
		
		list1.BubbleSortExData();
		list2.BubbleSortExData();
				
		System.out.println("First List - ");  list1.displayList();
		System.out.println("Second List - "); list2.displayList();
		
		SingleLinkedList list3;
		
		list3 = list1.merge1(list2);
		System.out.println("Merged List - "); list3.displayList();
		
		System.out.println("First List - ");  list1.displayList();
		System.out.println("Second List - "); list2.displayList();
		
		list3 = list1.merge2(list2);
		System.out.println("Merged List - "); list3.displayList();
		
		System.out.println("First List - ");  list1.displayList();
		System.out.println("Second List - "); list2.displayList();
	}
}
