/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

package heap;

public class Demo1 
{
	public static void buildHeap_TopDown(int[] a, int n)
    {
    	for(int i=2; i<=n; i++)
    		restoreUp(i,a);
    }
	
    public static void buildHeap_BottomUp(int[] a, int n)
    {
    	for(int i=n/2; i>=1; i--)
    		restoreDown(i,a,n);
    }
	
    private static void restoreUp(int i, int[] a)
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
		int a1[] = {99999,1,4,5,7,9,10};
		int n1=a1.length-1;
		
		buildHeap_BottomUp(a1,n1);
		
		for(int i=1; i<=n1; i++ )
			System.out.print(a1[i] + " ");
		System.out.println();
		
		
		int a2[] = {99999,1,4,5,7,9,10};
		int n2=a2.length-1;
		
		buildHeap_TopDown(a2,n2);
		
		for(int i=1; i<=n2; i++ )
			System.out.print(a2[i] + " ");
		System.out.println();
	}
}
