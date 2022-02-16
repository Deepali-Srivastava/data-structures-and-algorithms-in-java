/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

import java.util.Scanner;

public class AddressCalcSort 
{
	public static void sort(int[] a, int n) 
	{
		int i,j,x;
		
		SortedLinkedList[] List = new SortedLinkedList[6];
		for(i=0; i<6; i++)
			List[i] = new SortedLinkedList();
			
		int large=0;
		for(i=0; i<n; i++)
		{
			if(a[i] > large)
				large = a[i];
		}
		
		for(i=0; i<n; i++)
		{
			x=hash(a[i],large);
			List[x].insertInOrder(a[i]);
		}
		
		/*Elements of linked lists are copied to array*/
		Node p;
		i=0;
		for(j=0; j<=5; j++)
		{
			p=List[j].getStart();
			while(p!=null)
			{
				a[i++]=p.info;
				p=p.link;
			}
		}
	}
	
	public static int hash(int x, int large)
	{
		float temp;
		temp=(float)x/large;
		return (int)(temp*5);
	}
		
	public static void main(String[] args)
	{
		int i,n;
		int[] a = new int[20];
		Scanner scan = new Scanner(System.in);	
		
		System.out.print("Enter the number of elements : ");
		n = scan.nextInt();
				
		for(i=0; i<n; i++)
		{
			System.out.print("Enter element " + (i+1) + " : ");
			a[i] = scan.nextInt();
		}
		
		sort(a,n);
		
		System.out.println("Sorted array is : ");
		for(i=0; i<n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		scan.close();
	}
}
