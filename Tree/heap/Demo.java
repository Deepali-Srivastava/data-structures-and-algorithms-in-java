/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

package heap;

import java.util.Scanner;


public class Demo
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);	
					
		Heap h = new Heap(20);
				
		int choice,value;
				
		while(true)
		{
			System.out.println("1.Insert");
			System.out.println("2.Delete root");
			System.out.println("3.Display");
			System.out.println("4.Exit");
			System.out.print("Enter your choice : ");
			choice = scan.nextInt();
			
			if(choice==4)
				break;
			
			switch(choice)
			{
			 case 1:
				System.out.print("Enter the value to be inserted : ");
				value = scan.nextInt();
				h.insert(value);
				break;
			 case 2:
				System.out.println("Maximum value is " + h.deleteRoot());
				break;
			 case 3:
				h.display();
				break;
	 		 default:
				System.out.println("Wrong choice");
			}
		}
		scan.close();
	}
}
