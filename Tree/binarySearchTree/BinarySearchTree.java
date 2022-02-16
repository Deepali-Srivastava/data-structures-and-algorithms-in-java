/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

package binarySearchTree;

import java.lang.NullPointerException;

public class BinarySearchTree 
{
	private Node root;
	
	public BinarySearchTree()
	{
		root = null;
	}
	
	public boolean isEmpty()
	{
		return (root==null);		
	}
	public void insert(int x)
	{
		root = insert(root,x);
	}
	
	private Node insert(Node p, int x)
	{
		if(p==null)	
			p=new Node(x);
		else if(x < p.info)	
			p.lchild = insert(p.lchild,x);
		else if(x > p.info)	
			p.rchild = insert(p.rchild,x);  
		else
			System.out.println(x + " already present in tree");
		return p;
	}
	
	public void insert1(int x)
	{       
		Node p=root;
		Node par=null;
		
		while(p!=null)
		{
			par=p;
			if(x < p.info)
				p=p.lchild;	
			else if(x > p.info)
				p=p.rchild;
			else
			{	
				System.out.println(x + " already present in the tree");
				return;
			}
		}
		
		Node temp=new Node(x);

		if(par==null)
			root=temp;
		else if(x < par.info)
			par.lchild=temp;
		else
			par.rchild=temp;
	}
	
	public boolean search(int x)
	{
		return(search(root,x)!=null);
	}
	private Node search(Node p, int x)
	{
		if(p==null)   
			return null; /*key not found*/
		if(x < p.info)/*search in left subtree*/	
			return search(p.lchild, x);	
		if(x > p.info)/*search in right subtree*/
			return search(p.rchild, x);
		return p; /*key found*/
	}

	public boolean search1(int x)
	{
		Node p = root;
		while(p!=null)
		{
			if(x < p.info)
				p=p.lchild; /*Move to left child*/
			else if(x > p.info)
				p=p.rchild;  /*Move to right child */ 
			else	/*x found*/
				return true;
		}
		return false;
	}
	
	public void delete(int x)
	{
		root = delete(root,x);
	}
		
	private Node delete(Node p, int x)
	{
		Node ch,s;

		if(p==null)
		{
			System.out.println(x + "  not found");
			return p;
		}
		if(x < p.info)  /*delete from left subtree*/
			p.lchild = delete(p.lchild, x);
		else if(x > p.info) /*delete from right subtree*/
			p.rchild = delete(p.rchild, x);
		else
		{
			/*key to be deleted is found*/
			if( p.lchild!=null  &&  p.rchild!=null )  /*2 children*/
			{
				s=p.rchild;
				while(s.lchild!=null)
					s=s.lchild;
				p.info=s.info;
				p.rchild = delete(p.rchild,s.info);
			}
			else   /*1 child or no child*/	
			{
				if(p.lchild != null) /*only left child*/
					ch=p.lchild;
				else  /*only right child or no child*/
					ch=p.rchild;
				p=ch;
			}						
		}
		return p; 
	}

	public void delete1(int x)
	{
		Node p=root;
		Node par=null;
		while(p!=null)
		{
			if(x==p.info)
				break;
			par=p;
			if(x < p.info)
				p=p.lchild;	
			else 
				p=p.rchild;
		}

		if(p==null)
		{
			System.out.println(x + " not found");
			return;
		}
		
		/*Case C: 2 children*/
		/*Find inorder successor and its parent*/
		Node s,ps;
		if(p.lchild!=null && p.rchild!=null)
		{
			ps=p;
			s=p.rchild;
			while(s.lchild!=null)
			{
				ps=s;
				s=s.lchild;
			}
			p.info=s.info; 
			p=s;
			par=ps;
		}	

		/*Case B and Case A : 1 or no child*/
		Node ch;
		if(p.lchild!=null) /*node to be deleted has left child */
			ch=p.lchild;
		else                /*node to be deleted has right child or no child*/
			ch=p.rchild;

		if(par==null)   /*node to be deleted is root node*/
			root=ch;
		else if(p==par.lchild)/*node is left child of its parent*/
			par.lchild=ch;
		else       /*node is right child of its parent*/
			par.rchild=ch;
	}
	
	public int min()
	{
		if(isEmpty())
			throw new NullPointerException("Tree is empty");
		return min(root).info;
	}
	
	private Node min(Node p)
	{
		if(p.lchild==null)
	        return p;
		return min(p.lchild);
	}

	public int max()
	{
		if(isEmpty())
			throw new NullPointerException("Tree is empty");
		return max(root).info;
	}
	
	private Node max(Node p)
	{
		if(p.rchild==null)
	        return p;
		return max(p.rchild);
	}
	
	public int min1()
	{
		if(isEmpty())
			throw new NullPointerException("Tree is empty");
		Node p=root;
		while(p.lchild!=null)
			p=p.lchild;
		return p.info;
	}

	public int max1()
	{
		if(isEmpty())
			throw new NullPointerException("Tree is empty");
		Node p=root;
		while(p.rchild!=null)
			p=p.rchild;
		return p.info;
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
	}/*End of display()*/

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
		if(p==null )
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

	public int height()
	{
		return height(root);
	}
	
	private int height(Node p)
	{
		int hL,hR; 

		if(p==null) 
			return 0; 

		hL=height(p.lchild); 
		hR=height(p.rchild); 

		if(hL > hR) 
			return 1+hL; 
		else 
			return 1+hR; 
	}/*End of height()*/
}
