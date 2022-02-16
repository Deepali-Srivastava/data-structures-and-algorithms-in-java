/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

import java.util.Scanner;


public class Display1toN 
{
	public static void print1(int n)
	{
		if(n==0)
		   return;
		System.out.print(n + " ");	
		print1(n-1);
	}

	public static void print2(int n)
	{
		if(n==0)
		   return;
		print2(n-1);
		System.out.print(n + " ");	
	}

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("Enter value of n : ");
		n = scan.nextInt();
		
		print1(n);	
		System.out.println();
		
		print2(n);	
		System.out.println();
		
		scan.close();
	}
}
