/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

import java.util.Scanner;


public class Exponentiation 
{
	private Exponentiation() {} //this class is not for instantiation 
	
	public static float power(float x,int n)
	{
		if(n==0)
			return 1;
		return x*power(x,n-1);
	}

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		float x;
		int n;
		
		System.out.print("Enter values for x and n : ");
		x = scan.nextFloat();
		n = scan.nextInt();
		
		System.out.println(x + "^" + n + "=" + power(x,n));
				
		scan.close();
	}

}
