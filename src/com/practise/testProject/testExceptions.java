package com.practise.testProject;

public class testExceptions {
	public static void main(String[] args) {
		testExceptions obj = new testExceptions();
		obj.hello();
	}
	
	void hello()
	{
		try {
			int a = 10;
			int b = 0;
			try{
			System.out.println(a/b);
			System.out.println("Inside Try");
			}
			catch (NumberFormatException e) {
				System.out.println("Illegal Number Format");
			}
			System.out.println("Came out of inside Try");
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception "+e.toString());
		}
	}
}
