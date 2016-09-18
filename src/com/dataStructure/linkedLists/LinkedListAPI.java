package com.dataStructure.linkedLists;

public class LinkedListAPI {
	
	private LinkedList head = null;
	
	protected LinkedList createNode(String key)
	{
		LinkedList newnode = new LinkedList(key);
		return newnode;
	}
	
	public void addToFront(String data)
	{
		if(head==null)
		{
			LinkedList newnode = createNode(data);
			head=newnode;
		}
		else{
			LinkedList newnode = createNode(data);
			newnode.setNext(head);
			head = newnode;
		}
	}
	public void addToEnd(String data)
	{
		if(head==null)
		{
			LinkedList newnode = createNode(data);
			head=newnode;
		}
		else
		{
			LinkedList temp=head;
			LinkedList newnode = new LinkedList(data);
			while(temp.getNext()!=null)
				temp=temp.getNext();
			temp.setNext(newnode);
		}
	}
	
	public boolean isEmpty()
	{
		if(head==null)
			return true;
		else
			return false;
	}
	
	public String deleteFromFront(){
		
		if(head==null)
			return "Stack Underflow";
		else
		{
			String key= head.getData();
			head = head.getNext();
			return key;
		}
	}
	
	public String deleteFromEnd(){
		
		if(head==null)
			return "Stack Underflow";
		else if(head.getNext() == null)
		{
			String key = head.getData();
			head = null;
			return key;
		}
		else
		{
			LinkedList temp = head;
			LinkedList secondtemp =head;
			while(temp.getNext() != null){
				secondtemp = temp;
				temp = temp.getNext();
				
			}
			secondtemp.setNext(null);
			return temp.getData();
		}
	}
	
	public String getEntireList()
	{
		String data = "";
		if(head==null)
			return("Empty List");
		else
		{
			LinkedList temp = head;
			while(temp!=null)
			{
				data = data+temp.getData()+"\t";
				temp = temp.getNext();
			}
			return data;
		}
	}
}
