/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

package binaryTree;

public class BinaryTree 
{
	private Node root;
	
	public BinaryTree()
	{
	      root=null;
	}

	public void display()
	{
		display(root,0);
		System.out.println();
	}
		
	private void display(Node p,int level)
	{
		int i;
		if(p==null)
			return;
	
		display(p.rchild, level+1);
			System.out.println();
	
		for(i=0; i<level; i++)
			System.out.print("    ");
		System.out.print(p.info);
	
		display(p.lchild, level+1);
	}

	public void preorder()
	{
		preorder(root);
		System.out.println();
	}
	
	private void preorder(Node p)
	{
		if(p==null)	
			return;
		System.out.print(p.info + " ");
		preorder(p.lchild);
		preorder(p.rchild);
	}

	public void inorder()
	{
		inorder(root);
		System.out.println();
	}

	private void inorder(Node p)
	{
		if(p==null)
			return;
		inorder(p.lchild);
		System.out.print(p.info + " ");
		inorder(p.rchild);
	}

	public void postorder()
	{
		postorder(root);
		System.out.println();
	}
	
	private void postorder(Node p)
	{
		if(p==null)
			return;
		postorder(p.lchild);
		postorder(p.rchild);
		System.out.print(p.info + " ");
	}
	
	public void levelOrder()
	{
		if(root==null)
		{
			System.out.println("Tree is empty");
			return;
		}
			
		QueueA qu = new QueueA(20);
		qu.insert(root);
	
		Node p;
		while(!qu.isEmpty()) 
		{
			p=qu.Delete();
			System.out.print(p.info + " ");
			if(p.lchild!=null)
				qu.insert(p.lchild);
			if(p.rchild!=null)
				qu.insert(p.rchild);
		} 
		System.out.println();
	}
	
	public int height()
	{
		return height(root);
	}
	
	private int height(Node p)
	{
		if(p==null) 
			return 0; 

		int hL=height(p.lchild); 
		int hR=height(p.rchild); 

		if(hL > hR) 
			return 1+hL; 
		else 
			return 1+hR; 
	}
	
	public void createTree()
	{
		root = new Node('P');
		root.lchild = new Node('Q');
		root.rchild = new Node('R');
		root.lchild.lchild = new Node('A');
		root.lchild.rchild = new Node('B');
		root.rchild.lchild = new Node('X');
	}
}	