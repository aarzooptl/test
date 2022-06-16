package test;

public class RetrunTypeTest {

	public static void main(String[] args) {
	
		
    int x = sum();//value of a stores in x using return type
    
    System.out.println(x+6);
    System.out.println(sum());
    
    String y = Hello();
    System.out.println(y);
	}
	
	//here return type method int
	public static int sum()
	{
		int a = 4+5;
		return a;
		
	}
	//name is same as class name.
	//no return type
	public static String Hello()
	{
		String s = "Hello Java";
		return s;
		
	}

}
