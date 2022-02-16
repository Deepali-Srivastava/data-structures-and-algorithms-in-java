/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

import java.util.Scanner;

public class RadixSort 
{
	public static Node sort(Node start)
	{
		Node[] rear = new Node[10];
		Node[] front = new Node[10];

		int leastSigPos=1;
		int mostSigPos=digitsInLargest(start);

		int i,dig;
		Node p;
		for(int k=leastSigPos; k<=mostSigPos; k++) 
		{
			/*Making all the queues empty at the beginning of each pass*/
			for(i=0; i<=9 ; i++)
			{
				rear[i] = null;
				front[i] = null;
			}
						
			for(p=start; p!=null; p=p.link)
			{
				/*Find kth digit from right in the number*/
				dig = digit(p.info,k);
			
				/*Insert the node in Queue(dig) */
				if(front[dig] == null)			
					front[dig]=p;
				else
					rear[dig].link=p;
				rear[dig]=p;
			}
			
			/*Join all queues to form new linked list*/
			i=0;
			while(front[i] == null)  /*Finding first non empty queue*/
				i++;
			start = front[i]; 	
			while(i<=8) 
			{
				if(rear[i+1]!=null) /*if (i+1)th  queue is not empty*/
					rear[i].link=front[i+1]; /*join end of ith queue to start of (i+1)th queue*/
				else							
					rear[i+1]=rear[i]; /*continue with rear[i]*/
				i++;
			}
			rear[9].link=null;  
		}
		return start;
	}/*End of sort*/

	/*Returns number of digits in the largest element of the list */
	public static int digitsInLargest(Node start)  
	{
		/*Find largest element*/
		int large=0;
		Node p=start;
		while(p!=null)
		{
			if(p.info > large)
				large = p.info;
			p=p.link;
		}
		
		/*Find number of digits in largest element*/
		int ndigits=0;
		while(large!=0)
		{
			ndigits++;
			large/=10;
		}
		return ndigits;
	} 

	/*Returns kth digit from right in n*/
	public static int digit(int n, int k)
	{
		int d=0,i;
		for(i=1; i<=k; i++)
		{
			d=n%10;
			n/=10;
		}
		return d;
	}

	public static void main(String[] args) 
	{		
		Node temp,p;
		int i,n,data;

		Scanner scan = new Scanner(System.in);	
				
		System.out.println("Enter number of elements in the list : ");
		n = scan.nextInt();
    	
		Node start=null;
		for(i=1; i<=n; i++)  /*Inserting elements in linked list*/
		{
			System.out.print("Enter element " + i + " ");
			data = scan.nextInt();
		
			temp = new Node(data);
			if(start==null)
				start=temp;
			else
			{
				p=start;
				while(p.link!=null)
					p=p.link;
				p.link=temp;
			}
		}
		
		start = sort(start);
		
		System.out.println("Sorted list is :\n");
		p=start;
		while(p!=null)
		{
			System.out.print(p.info + " ");
			p=p.link;
		}
		System.out.println();
		scan.close();
	}
}
