/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

package binaryTree;

public class Demo
{
	public static void main(String[] args) 
	{
		BinaryTree bt = new BinaryTree(); 

		bt.createTree();

		bt.display();
		System.out.println();
		
	    System.out.println("Preorder : ");
		bt.preorder(); 
		System.out.println("");

		System.out.println("Inorder : ");
		bt.inorder();
		System.out.println();

		System.out.println("Postorder : ");
		bt.postorder();
		System.out.println();

		System.out.println("Level order : ");
		bt.levelOrder();
		System.out.println();
		
		System.out.println("Height of tree is " + bt.height());
	}

}
