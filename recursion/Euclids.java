/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

import java.util.Scanner;

public class Euclids 
{
	private Euclids(){} //this class is not for instantiation
	
	public static int GCD(int a, int b)   
	{
		if(b==0)
		   return a;
		return GCD(b, a%b);
	}
	
	public static void main(String[] args) 
	{
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter values for a and b : ");
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.println("GCD of " + a + " and " + b + " is " + GCD(a,b));
		scan.close();
	}
}
