/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

package deque;

import java.util.Scanner;

public class Demo 
{
	public static void main(String[] args) 
	{
		int choice,x;
		
		Scanner scan = new Scanner(System.in);	
		DequeA dq = new DequeA(8);

		while(true)
		{
			System.out.println("1.Insert at the front end");
			System.out.println("2.Insert at the rear end");
			System.out.println("3.Delete from front end");
			System.out.println("4.Delete from rear end");
			System.out.println("5.Display all elements of deque");
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
				dq.insertFront(x);
				break;
			case 2:
				System.out.print("Enter the element to be inserted : ");
				x = scan.nextInt();
				dq.insertRear(x);
				break;
			 case 3:
				System.out.println("Element deleted from front end is " + dq.deleteFront());
				break;
			 case 4:
				System.out.println("Element deleted from rear end is  " + dq.deleteRear());
				break;
			 case 5:
				dq.display();
				break;
			 default:
				System.out.println("Wrong choice");
			}
		}
		scan.close();
	}
}
