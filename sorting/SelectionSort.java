/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

import java.util.Scanner;

public class SelectionSort 
{
	private SelectionSort(){} //this class is not for instantiation
		
	public static void sort(int[] a, int n) 
	{
		int minIndex,temp,i,j;
		
		for(i=0; i<n-1; i++)   
		{
			minIndex=i;
			for(j=i+1; j<n; j++)  
			{
				if(a[j]<a[minIndex])
					minIndex=j;
			}
			if(i!=minIndex)
			{
				temp = a[i];
				a[i] = a[minIndex];
				a[minIndex] = temp;
			}
		}
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
