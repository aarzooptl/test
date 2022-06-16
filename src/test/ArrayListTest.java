package test;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		//Classname Objname = new Classname();		
		ArrayList<String> tools = new ArrayList<String>();//syntax for arraylist 

		tools.add("selenium");
		tools.add("Java");
		tools.add("Testlink");
		tools.add("TestRail");
		
		System.out.println("Size of Array should be" + " " + tools.size());
		
		/*System.out.println(tools.get(0));
		System.out.println(tools.get(1));
		System.out.println(tools.get(2));
		System.out.println(tools.get(3));*/
		
		/*for(int i=0; i<tools.size(); i++)
		{
			System.out.println(tools.get(i));
		}*/
		
		for(String s : tools) //alternate loop for each
		{
		 System.out.println(s);	
		}
		tools.add("Git");
		System.out.println("New Size after adding Git" + " " + tools.size());//we add new element so the size of array will be 5
		
		tools.remove(2); //delete Testlink 
		System.out.println(tools.get(2));//TestRail take place at index 2
		System.out.println(tools.size());

	}

}
