package test;

public class ArgumentsTest {

	public static void main(String[] args) {
		
	 sum(); //1+2
	 sum(11,22); //11+22
	 sum(11,22,33); //11+22+33
	}
	
	public static void sum()
	{
		int a = 1+2;
		System.out.println("Total of 1+2 :" + a);
	}
	
	public static void sum(int b, int c)//two arguments
	{
		int a = b+c;
		System.out.println("Total of 11+22 : " + a);
	}
	
	public static void sum(int b, int c, int d)//three arguments
	{
		int a = b+c+d;
		System.out.println("Total of 11+22+33 : " + a);
	}

}
