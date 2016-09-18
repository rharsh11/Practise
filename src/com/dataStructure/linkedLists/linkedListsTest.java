package com.dataStructure.linkedLists;

import java.io.InputStream;
import java.util.Scanner;

public class linkedListsTest {
	
	public static void main(String[] args) {
		
		LinkedListAPI list = new LinkedListAPI();
		
		String message = "Enter 1: Add Front\n2: Add End\n3: Delete Front\n4: Delete End\n5: Entire List\n6: Quit";
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		int choice = sc.nextInt();
		while(choice != 6)
		{
			switch(choice)
			{
			case 1:
				System.out.print("Enter Data : ");
				list.addToFront(sc.next());
				break;
			case 2:
				System.out.print("Enter Data : ");
				list.addToEnd(sc.next());
				break;
			case 3:
				System.out.println("Deleted data : "+list.deleteFromFront());;
				break;
			case 4:
				System.out.println("Deleted data : "+list.deleteFromEnd());;
				break;
			case 5:
				System.out.println(list.getEntireList());
				break;
			default:
				System.out.println("Wrong Choice");
			}
			
			System.out.println(message);
			choice = sc.nextInt();
		}
	}

}
