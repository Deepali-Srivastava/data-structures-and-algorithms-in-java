/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

import java.util.Scanner;

public class LinearSearchSortedArray 
{
	private LinearSearchSortedArray(){} //this class is not for instantiation
	
	public static int search(int[] a, int n, int searchValue) 
	{
		int i;
		for(i=0; i<n ; i++)
		{
			if(a[i] >= searchValue )     
				break;
		}
		if(a[i]==searchValue)
			return i;
		else
			return -1;
	}
	
	public static void main(String[] args)
	{
		int i,n,searchValue, index;
		
        int[] a = new int[100];

        Scanner scan = new Scanner(System.in);	
        
        System.out.print("Enter the number of elements : ");
        n = scan.nextInt();

        System.out.println("Enter the elements in sorted order - ");
	    for(i=0; i<n; i++)
            a[i] = scan.nextInt();

	    System.out.print("Enter the search value : ");
        searchValue = scan.nextInt();
	
	    index = search(a, n, searchValue);
	
	    if( index == -1 )
	    	System.out.println("Value " + searchValue + " not present in the array");
	    else
	    	System.out.println("Value " + searchValue + " present at index " + index);
	}
}
