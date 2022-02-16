/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

import java.util.Scanner;

public class QuickSort 
{
	private QuickSort(){} //this class is not for instantiation
		
	public static void sort(int[] a, int n) 
	{
		sort(a,0,n-1);
	}
	
	private static void sort(int a[],int low,int up)
	{
		if(low>=up) /*zero or one element in sublist*/
			return;
		int p = partition(a,low,up);
		sort(a,low,p-1); /*Sort left sublist*/
		sort(a,p+1,up);  /*Sort right sublist*/
	}

	private static int partition(int[] a, int low, int up)
	{
		int temp,i,j,pivot;
		
		pivot=a[low]; 

		i=low+1; /*moves from left to right*/
		j=up;    /*moves from right to left*/
		
		while(i<=j)  
		{
			while( a[i]<pivot && i<up ) 
	   			i++; 
			
			while( a[j] > pivot ) 	
				j--;
			
			if(i<j) /*swap a[i] and a[j]*/
			{
				temp=a[i];	
				a[i]=a[j];	
				a[j]=temp;
				i++; 
				j--;
			}
			else /*found proper place for pivot*/
				break;
		}
		
		/* Proper place for pivot is j */
		a[low]=a[j];
		a[j]=pivot;
		
		return j;
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
