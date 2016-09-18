package com.dataStructure.queue;

/**
 * @author harsh
 *This will use only int values. Only a test DS not a generic one
 */
abstract class getQueue {
	
	public static int maxSize= 5;
	protected int que[];
	int top,bottom;
	
	public getQueue()
	{
		que = new int[maxSize];
		top=bottom=-1;
	}
	
	public abstract boolean isEmpty();
	public abstract void enqueue(int data);
	public abstract int dequeue();
}
