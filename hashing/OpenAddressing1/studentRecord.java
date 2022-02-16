/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

package OpenAddressing1;

public class studentRecord 
{
	private int studentId;
	private String studentName;
	
	public studentRecord(int i, String name)
	{
		studentId=i;
		studentName = name;
	}
	
	public int getstudentId()
	{
		return studentId;
	}
	
	public void setstudentId(int i)
	{
		studentId = i;
	}
	
	public String toString()
	{
		return  studentId + " " + studentName + " ";
	}
}
