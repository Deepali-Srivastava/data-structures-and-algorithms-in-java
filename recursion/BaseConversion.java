/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

import java.util.Scanner;

public class BaseConversion 
{
	BaseConversion() {} //this class is not for instantiation 
	
	public static void toBinary(int n)
	{
		if(n==0)
			return;
		toBinary(n/2);
		System.out.print(n%2);	
	}

	public static void convertBase(int n,int base)
	{
		if(n==0)
			return;
		convertBase(n/base,base);
		
		int remainder=n%base;
		if(remainder<10)
			System.out.print(remainder);	
		else
			System.out.print((char) (remainder-10+'A'));
	}


	public static void main(String[] args) 
	{
		int n;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a positive decimal number : ");
		n=scan.nextInt();

		System.out.print("Binary form : "); toBinary(n);		
		System.out.println();
		System.out.print("Binary form : "); convertBase(n,2);	
		System.out.println();
		System.out.print("Octal form : "); convertBase(n,8);	
		System.out.println();
		System.out.print("Hexadecimal form : "); convertBase(n,16);	
		System.out.println();
		scan.close();
	}

}
