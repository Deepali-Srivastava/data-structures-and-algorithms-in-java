/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

package heap;

import java.util.NoSuchElementException;

public class Heap 
{
	private int[] a;
    private int n;
      
    public Heap()
    {
       	a=new int[10];
    	n=0;
    	a[0]=99999;
    }
    public Heap(int maxSize)
    {
       	a=new int[maxSize];
    	n=0;
    	a[0]=99999;
    }
    public void insert(int value)
    {
    	n++;  
    	a[n]=value;
    	restoreUp(n);
    }

    private void restoreUp(int i)
    {
    	int k=a[i];  
    	int iparent=i/2;
    	
    	while(a[iparent]<k)      /* No sentinel : while(iparent>=1 && a[iparent]<k)  */
    	{
    		a[i]=a[iparent];
    		i=iparent;
    		iparent=i/2;
    	}
    	a[i]=k; 
    }

    public int deleteRoot()
    {
    	if(n==0)
    		throw new NoSuchElementException("Heap is Empty");
    	
    	int maxValue=a[1]; 
    	a[1]=a[n];
    	n--;  
    	restoreDown(1);
    	return maxValue;
    }

    private void restoreDown(int i)
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

    public void display()
    {       
    	int i;
    	if(n==0)
    	{
    		System.out.println("Heap is empty");
    		return;
    	}
    	System.out.println("Heap size = " + n);
    	for(i=1; i<=n; i++)
    		System.out.print(a[i] + " ");
    	System.out.println();
    }
 }
