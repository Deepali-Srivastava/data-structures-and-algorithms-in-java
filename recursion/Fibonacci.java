/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

import java.util.Scanner;

public class Fibonacci 
{	
	private Fibonacci() {} //this class is not for instantiation  

	public static int fib(int n)		
	{
		if(n==0 )
			return 0;
		if(n==1)
			return 1;
		return fib(n-1) + fib(n-2);
	}

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of terms : ");
		int terms = scan.nextInt();
		
		for(int i=0; i<=terms; i++)
			System.out.print(fib(i)+" ");
		scan.close();
	}
}
