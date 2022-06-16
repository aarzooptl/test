package test;

public class Test3 {
	
	static Test3 sq1 = new Test3(); //Made object for square
	static Test1 t1 = new Test1(); //Made object for testme method for Test1 class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		circle();//calling circle
		sq1.square();//calling non static method using object
		Test1.printMe();//calling printme method from Test1 class it is already static
		t1.testMe();
	}
	
	public static void circle() //Create static method
	{
		System.out.println("Hey this is Circle");
	}
	
	public void square() //Create non static method
	{
		System.out.println("Hey this is Square");
	}
}
