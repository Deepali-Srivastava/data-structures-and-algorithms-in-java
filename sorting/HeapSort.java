/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

import java.util.Scanner;

public class HeapSort 
{
	private HeapSort(){} //this class is not for instantiation
		
	public static void sort(int[] a, int n)  
	{
		buildHeap_BottomUp(a,n);

		int maxValue;
		while(n>1)
		{
			maxValue=a[1];
			a[1]=a[n];
			a[n]=maxValue;
			n--;  
	    	restoreDown(1,a,n);
	    }
	}
	
	public static void buildHeap_BottomUp(int[] arr, int n)
    {
    	int i;
    	for(i=n/2; i>=1; i--)
    		restoreDown(i,arr,n);
    }
	
	private static void restoreDown(int i, int[] a, int n)
    {
    	int k=a[i];
    	int lchild=2*i, rchild=lchild+1;
    		
    	while(rchild<=n)
    	{
    		if( k>=a[lchild] && k>=a[rchild] )  
    		{
    			a[i]=k;
    			return;
    		}
    		else if(a[lchild] > a[rchild])
    		{
    			a[i]=a[lchild]; 
    			i=lchild;
    		}
   		else
    		{
    			a[i]=a[rchild];
    			i=rchild;
    		}
    		lchild=2*i;
    		rchild=lchild+1;
    	}

    	/*If number of nodes is even*/	
    	if(lchild==n && k<a[lchild]) 
    	{
    		a[i]=a[lchild];
    		i=lchild;
    	}
    	a[i]=k;
    }
	
	public static void main(String[] args)
	{
		int i,n;
		int[] a = new int[20];
		
		Scanner scan = new Scanner(System.in);	
		
		System.out.print("Enter the number of elements : - ");
		n = scan.nextInt();
				
	for(i=1; i<=n; i++)
		{
			System.out.print("Enter element " + i + " : ");
			a[i] = scan.nextInt();
		}
		
		sort(a,n);
		
		System.out.println("Sorted array is : ");
		for(i=1; i<=n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
}

