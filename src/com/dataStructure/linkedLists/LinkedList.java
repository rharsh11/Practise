package com.dataStructure.linkedLists;
//Comment3 At0106 hours
public class LinkedList {
	
	private String data;
	private LinkedList next;
	
	protected LinkedList(String data)
	{
		this.data=data;
		this.next=null;
	}
	
	public String getData() {
		return data;
	}
	public LinkedList getNext() {
		return next;
	}

	public void setNext(LinkedList next) {
		this.next = next;
	}
	
	
}
