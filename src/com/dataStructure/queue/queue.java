package com.dataStructure.queue;

public class queue extends getQueue{

	public boolean isEmpty() {
		if(top == -1 && bottom == -1)
			return true;
		else
			return false;
	}

	public void enqueue(int data) {
		
		if(isEmpty())
		{
			top=bottom=0;
			this.que[bottom]=data;
			System.out.println("Operation Completed");
		}
		else
		{
			if((bottom+1)%maxSize == top)
				System.out.println("Queue Full.\nInvalid Operation !");
			else
			{
				bottom = ++bottom%maxSize;
				this.que[bottom]= data;
				System.out.println("Operation Completed");
			}
		}
		
	}
	
	public int dequeue() {

		if(isEmpty())
			return -555;
		else
		{
			if(top == bottom)
			{
				int key = this.que[top];
				top=bottom=-1;
				return key;
			}
			else
			{
				int key = this.que[top];
				top = ++top%maxSize;
				return key;
			}
		}
	}
	public String getQueue()
	{
		int temp =top;
		String data = "";
		
		if(isEmpty())
			return "Empty Queue";
		
		while(temp != bottom)
		{
			data+= this.que[temp]+"\t";
			temp = (++temp)%maxSize;
		}
		data+= this.que[temp];
		return data;
	}	
}
