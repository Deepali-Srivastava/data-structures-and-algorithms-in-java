/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

package SeparateChaining;

public class Node 
{
	public studentRecord info;
	public Node link;
	
	public Node(studentRecord rec) 
	{
		info=rec;
		link=null;
	}
}
