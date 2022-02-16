/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

package singleLinkedList;
import java.util.Scanner;

public class Demo 
{
	public static void main(String[] args)
	{
		int choice,data,k,x;
	
		Scanner scan = new Scanner(System.in);	
		
		SingleLinkedList List = new SingleLinkedList();
		
		List.createList();
		
		while(true)
		{
			System.out.println("1.Display list");
			System.out.println("2.Count the number of nodes");
			System.out.println("3.Search for an element");
			System.out.println("4.Insert in empty list/Insert in beginning of the list");
			System.out.println("5.Insert a node at the end of the list");
			System.out.println("6.Insert a node after a specified node");
			System.out.println("7.Insert a node before a specified node");
			System.out.println("8.Insert a node at a given position");
			System.out.println("9.Delete first node");
			System.out.println("10.Delete last node");
			System.out.println("11.Delete any node");
			System.out.println("12.Reverse the list");
			System.out.println("13.Bubble sort by exchanging data");
			System.out.println("14.Bubble sort by exchanging links");
			System.out.println("15.MergeSort");
			System.out.println("16.Insert Cycle");
			System.out.println("17.Detect Cycle");
			System.out.println("18.Remove cycle");
			System.out.println("19.Quit");
			
			System.out.print("Enter your choice : ");
			choice = scan.nextInt();
					
			if(choice==19)
				break;

			switch(choice)
			{
			 case 1:
				List.displayList();
				break;
			 case 2:
				List.countNodes();
				break;
			 case 3:
				System.out.print("Enter the element to be searched : ");
				data=scan.nextInt();
				List.search(data);
				break;
			 case 4:
				System.out.print("Enter the element to be inserted : ");
				data=scan.nextInt();
				List.insertInBeginning(data);
				break;
			 case 5:
				System.out.print("Enter the element to be inserted : ");
				data=scan.nextInt();
				List.insertAtEnd(data);
				break;
			 case 6:
				System.out.print("Enter the element to be inserted : ");
				data=scan.nextInt();
				System.out.print("Enter the element after which to insert : ");
				x=scan.nextInt();
				List.insertAfter(data,x);
				break;
			 case 7:
				System.out.print("Enter the element to be inserted : ");
				data=scan.nextInt();
				System.out.print("Enter the element before which to insert : ");
				x=scan.nextInt();
				List.insertBefore(data,x);
				break;
			 case 8:
				System.out.print("Enter the element to be inserted : ");
				data=scan.nextInt();
				System.out.print("Enter the position at which to insert : ");
				k=scan.nextInt();
				List.insertAtPosition(data,k);
				break;
			 case 9:
				List.deleteFirstNode();
				break;
			 case 10:
				List.deleteLastNode();
				break;
			 case 11:	
				System.out.print("Enter the element to be deleted : ");
				data=scan.nextInt();
				List.deleteNode(data);	
				break;
			case 12:
				List.reverseList();
				break;
			case 13:
				List.BubbleSortExData();
				break;
			case 14:
				List.BubbleSortExLinks();
				break;
			case 15:
				List.mergeSort();
				break;
			case 16:
				System.out.print("Enter the element at which the cycle has to be inserted : ");
				data=scan.nextInt();
				List.insertCycle(data);
				break;
			case 17:
				if(List.hasCycle())
					System.out.println("List has a cycle");
				else
					System.out.println("List does not have a cycle");
				break;
			case 18:
				List.removeCycle();
				break;
			default:
				 System.out.println("Wrong choice");
			}/*End of switch*/
			System.out.println();
		}/*End of while*/
		scan.close();
		System.out.println("Exiting");
	}/*End of main()*/
}

