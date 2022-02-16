/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

package queueArray;

import java.util.Scanner;

public class Demo
{
	public static void main(String[] args) 
	{
	      int choice,x;
	      Scanner scan = new Scanner(System.in);	
	
	      QueueA qu = new QueueA(8);
		
	      while(true)
	      {
		     System.out.println("1.Insert an element in the queue");
		     System.out.println("2.Delete an element from the queue");
		     System.out.println("3.Display element at the front");
		     System.out.println("4.Display all elements of the queue");
		     System.out.println("5.Display size of the queue");
	      	 System.out.println("6.Quit");
		     System.out.print("Enter your choice : ");
		     choice = scan.nextInt();
		     if(choice==6)
			   break;
	
		    switch(choice)
		    {
		      case 1:
			    System.out.print("Enter the element to be inserted : ");
			    x = scan.nextInt();
			    qu.insert(x);
			    break;
		      case 2:
			    x=qu.Delete();
			    System.out.println("Element deleted is : " + x);
			    break;
		      case 3:
			    System.out.println("Element at the front is : " + qu.peek());
			    break;
		      case 4:
			    qu.display();
			    break;
		      case 5:
			    System.out.println("Size of queue is " + qu.size());
			    break;
		      default:
			    System.out.println("Wrong choice");
		  }
		System.out.println();
		
	}
	 scan.close();
  }
}
