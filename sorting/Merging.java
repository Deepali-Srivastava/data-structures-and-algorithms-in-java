/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

import java.util.Scanner;

public class Merging
{
	private Merging(){}	   //this class is not for instantiation
	
	public static void merge(int[] a1, int[] a2, int[] temp, int n1, int n2)
	{
		int i=0,j=0,k=0;
		
		while( (i<=n1-1) && (j<=n2-1) )
		{
			if(a1[i] < a2[j])
				temp[k++]=a1[i++];
			else
				temp[k++]=a2[j++];
		}
		
		/*copy remaining elements of a1, array a2 finished */
		while(i<=n1-1)
			temp[k++]=a1[i++];
		
		/*copy remaining elements of a2, array a1 finished */
		while(j<=n2-1)
			temp[k++]=a2[j++];
	}
		
	public static void main(String[] args)
	{
		int i,n1,n2;
		int[] a1 = new int[20];
		int[] a2 = new int[20];
		int[] temp = new int[40];
		
		Scanner scan = new Scanner(System.in);	
		
		System.out.print("Enter the number of elements in array a1 : ");
		n1 = scan.nextInt();
		System.out.println("Enter elements in sorted order : " );
		for(i=0; i<n1; i++)
		{
			System.out.print("Enter element " + (i+1) + " : ");
			a1[i] = scan.nextInt();
		}
		
		System.out.print("Enter the number of elements in array a2 : ");
		n2 = scan.nextInt();
		System.out.println("Enter elements in sorted order : ");
		for(i=0; i<n2; i++)
		{
			System.out.print("Enter element " + (i+1) + " : ");
			a2[i] = scan.nextInt();
		}
		
		merge(a1,a2,temp,n1,n2);
						
		System.out.println("Merged array temp is : ");
		for(i=0; i<n1+n2; i++)
			System.out.print(temp[i] + " ");
		System.out.println();
		scan.close();
	}
	
}
