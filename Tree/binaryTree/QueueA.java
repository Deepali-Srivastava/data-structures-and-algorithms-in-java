/*
Copyright (C) Deepali Srivastava - All Rights Reserved
This code is part of DSA course available on CourseGalaxy.com    
*/

package binaryTree;

import java.util.NoSuchElementException;

public class QueueA 
{
	private Node[] queueArray;
    private int front;
    private int rear;
	
    public QueueA()
    {
       	queueArray = new Node[10];
    	front = -1;
    	rear = -1;
    }
    public QueueA(int maxSize)
    {
    	queueArray = new Node[maxSize];
    	front = -1;
    	rear = -1;
    }
    public boolean isEmpty()
    {
    	return (front==-1 || front==rear+1);
    }

    public boolean isFull()
    {
    	return (rear == queueArray.length - 1 );
    }

    public int size()
    {
    	if(isEmpty())
    		return 0;
    	else
    		return rear-front+1;
    }

    public void insert(Node x)
    {
    	if(isFull())
    	{
    		System.out.println("Queue Overflow\n");
    		return;
    	}
    	if(front==-1)  
    		front=0;
    	rear=rear+1;
    	queueArray[rear]=x;
    }

    public Node Delete()
    {
    	Node x;
    	if(isEmpty())
    	{
    		System.out.println("Queue Underflow");
    		throw new NoSuchElementException();
    	}
    	x=queueArray[front];
    	front=front+1;
    	return x;
    }

    public Node peek()
    {
    	if(isEmpty())
    	{
    		System.out.println("Queue Underflow\n");
    		throw new NoSuchElementException();
    	}
    	return queueArray[front];
    }

    public void display()
    {
    	int i;

    	if(isEmpty())
    	{
    		System.out.println("Queue is empty\n");
    		return;
    	}
    	
    	System.out.println("Queue is :\n\n");
    	for(i=front; i<=rear; i++)
    		System.out.print(queueArray[i] + " ");

    	System.out.println();
    }

}
