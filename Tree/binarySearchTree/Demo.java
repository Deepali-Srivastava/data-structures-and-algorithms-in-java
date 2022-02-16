/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

package binarySearchTree;
import java.util.Scanner;
public class Demo 
{
	public static void main(String[] args) 
	{
		BinarySearchTree bt = new BinarySearchTree(); 
		int choice,x;
		
		Scanner scan = new Scanner(System.in);	
		
		while(true)
		{
			System.out.println("1.Display Tree");
			System.out.println("2.Search");
			System.out.println("3.Insert a new node");
			System.out.println("4.Delete a node");
			System.out.println("5.Preorder Traversal");
			System.out.println("6.Inorder Traversal");
			System.out.println("7.Postorder Traversal");
			System.out.println("8.Height of tree");
			System.out.println("9.Find Minimum key");
			System.out.println("10.Find Maximum key");
			System.out.println("11.Quit");
			System.out.println("Enter your choice : ");
			choice = scan.nextInt();

			if(choice==11)
				break;

			switch(choice)
			{
			case 1:
				bt.display();
				break;
			case 2: 
				System.out.print("Enter the key to be searched : ");
				x = scan.nextInt();
				
				if(bt.search(x))
					System.out.println("Key found");
				else
					System.out.println("Key not found");
				break;
			case 3:
				System.out.println("Enter the key to be inserted : ");
				x = scan.nextInt();
				bt.insert(x);
				break;
			case 4:
				System.out.println("Enter the key to be deleted : ");
				x = scan.nextInt();
				bt.delete(x);
				break;
			 case 5:
				bt.preorder();
				break;
			 case 6:
				bt.inorder();
				break;
			 case 7:
				bt.postorder();
				break;
			 case 8:
				System.out.println("Height of tree is " + bt.height());
				break;
			 case 9:
				System.out.println("Minimum key is " + bt.min());
				break;
			 case 10:
				System.out.println("Maximum key is " + bt.max());
				break;
			}/*End of switch */
		}/*End of while */
		scan.close();
	}
}
