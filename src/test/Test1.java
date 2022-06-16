package test;

import selenium.Test4; //imported pacakge

public class Test1 {
	
	static Test1 t1 = new Test1(); //we define static as this is in class level so we can call any method within calls
	static Test2 t2 = new Test2();
	static Test3 sq1 = new Test3();
	static Test4 t4 = new Test4();//class from different pacakage
	public static void main(String[] args) {
		
		//Test1 t1 = new Test1(); // we define it in main method which is static
		System.out.println("I am in main method");
		Test1.printMe();
		System.out.println("End of the print");
		Test1.scanMe();
		t1.paintMe();
		t1.testMe();
		Test2.red();
		t2.blue();
		sq1.square();//call Square method from Test3 as it was not static we made object
		Test3.circle();// call Circle method from Test3
		Test4.bmw();//calling bmw method using class as it was static
		t4.audi();//calling audi method using t4
		
	}

	public static void printMe()
	{
		System.out.println("Print Me");
		//t1.paintMe();
	}
	public static void scanMe()
	{
		System.out.println("Scan Me");	
	}
	public void paintMe()
	{
		System.out.println("Paint Me");
	}
	public void testMe()
	{
		System.out.println("Test Me");
	}
}
