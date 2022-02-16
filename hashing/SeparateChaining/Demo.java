/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

package SeparateChaining;

import java.util.Scanner;

public class Demo 
{
	public static void main(String[] args) 
	{
		int id,choice;
		String name;
		
		Scanner scan = new Scanner(System.in);
			
		System.out.print("Enter initial size of table : ");
		int size = scan.nextInt();
			
		HashTable table = new HashTable(size);
		
		while(true)
		{
			System.out.println("1.Insert a record");
			System.out.println("2.Search a record");
			System.out.println("3.Delete a record");
			System.out.println("4.Display table");
			System.out.println("5.Exit");
			
			System.out.print("Enter your choice : ");
	        choice = scan.nextInt();

	        if (choice == 5)
	                break;
			
	        switch(choice)
			{
				case 1 : 
				   System.out.print("Enter student id : ");
				   id = scan.nextInt();
				   System.out.print("Enter student name : ");
				   name = scan.next();
				
				   studentRecord aRecord = new studentRecord(id,name);
				   
				   table.Insert(aRecord);
				   break;
				case 2 : 
				   System.out.print("Enter a key to be searched : ");
				   id = scan.nextInt();
				   aRecord = table.Search(id); 
						   
				   if( aRecord==null )
					   System.out.println("Key not found");
				   else
					   System.out.println(aRecord);
					   
				   break;
				case 3: 
				   System.out.print("Enter a key to be deleted : ");
				   id = scan.nextInt();
				   table.Delete(id);
				   break;
				case 4:
				   table.DisplayTable();
				   break;
			}
		}
		scan.close();
	}
}
