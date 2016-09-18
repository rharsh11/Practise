package com.dataStructure.queue;

import java.util.Scanner;

public class testQueue {
public static void main(String[] args) {
	
	queue que = new queue();
	
	String message = "Press 1: Enqueue 2: Dequeue 3: Full Queue 4: Exit";
	
	Scanner sc = new Scanner(System.in);
	System.out.println(message);
	int choice = sc.nextInt();
	while(choice != 4)
	{
		switch(choice)
		{
			case 1:
				que.enqueue(sc.nextInt());
				break;
			
			case 2:
				System.out.println(que.dequeue());
				break;
				
			case 3:
				System.out.println(que.getQueue());
				break;
				
			default:
				System.out.println("Invalid");
		}
		System.out.println(message);
		choice = sc.nextInt();
	}
}
}
