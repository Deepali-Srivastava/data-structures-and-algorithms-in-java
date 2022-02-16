/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

import java.util.Scanner;

public class SumOfDigits 
{
	private SumOfDigits() {} //this class is not for instantiation 
	
	public static long sumDigits(long n)
	{
		if(n/10==0) 
			return n;
		return sumDigits(n/10) + n%10;		
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		long n;
		System.out.print("Enter a number : ");
		n = scan.nextLong();
		System.out.println(sumDigits(n));
		scan.close();
	}
}
