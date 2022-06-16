package test;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String automation = "Selenium";
		System.out.println(automation);

		String type = "testing";
		System.out.println(type);

		String space = " ";

		System.out.println(automation + type); //concat string using + sign
		System.out.println(automation+ " " +type);
		System.out.println(automation+space+type); 
		
		int a = 10;
		int b = 20;
		
		System.out.println(automation+type+a+b); //Selenium1020
		System.out.println(automation+type+(a+b)); //Selenium30
		System.out.println(a+b+automation+type+a+b); 





	}

}
