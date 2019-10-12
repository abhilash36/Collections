package arraylist;

import java.util.ArrayList;

public class ContainsAll 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer>ls3=new ArrayList<>();
		ls3.add(10);
		ls3.add(20);
		ls3.add(30);
		
		System.out.println("object of array list 3 are: "+ls3);
		
		ArrayList<Integer> ls4=new ArrayList<>();
		ls4.add(10);
		ls4.add(30);
		ls4.add(20);
		
		System.out.println("object of array list 4 are: "+ls4);
		
		System.out.println(ls3.containsAll(ls4));
	}

}
