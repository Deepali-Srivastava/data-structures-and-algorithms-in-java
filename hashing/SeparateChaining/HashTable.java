/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

package SeparateChaining;

public class HashTable 
{
	private SingleLinkedList[] array;
	private int m;  //size of the array
	private int n;  //number of records
	
	public HashTable()
	{
		this(11);
	}
	
	public HashTable(int tableSize)
	{
		m = tableSize;
		array = new SingleLinkedList[tableSize];
	}
	
	int hash(int key)
	{
		return(key%m);
	}
	
	public void DisplayTable()
	{
		System.out.println("Number of records = " + n );
		for(int i=0; i<m; i++)
		{
		   System.out.print( "[" + i + "]  -->  " );
		   
		   if(array[i]!= null)
		      	array[i].displayList();
		   else
			   System.out.println("___");
		}
	}
	
	public studentRecord Search(int key)
	{
		int h = hash(key);	
		
		if( array[h]!= null)
			return array[h].search(key);
		
		return null;
	}
	
	public void Insert(studentRecord newRecord)
	{
		int key = newRecord.getstudentId();
		int h = hash(key);
		
		if(array[h]==null)
			array[h] = new SingleLinkedList();
		
		array[h].insertInBeginning(newRecord);
		n++;
	}
		
	public void Delete(int key)
	{
		int h = hash(key);
		
		if(array[h]!=null)
		{
			array[h].deleteNode(key);
			n--;
		}
		else
			System.out.println("Value " + key + " not present\n");
	}
}


