package arraylist;

import java.util.ArrayList;

public class Contains
{
	public static void main(String[] args)
	{
		ArrayList<Integer> ls5=new ArrayList<>();
		ls5.add(10);
		ls5.add(20);
		ls5.add(30);
	
		
		System.out.println("object of array list ls5 are: "+ls5);
		
		System.out.println(ls5.contains(30)); //true
		System.out.println(ls5.contains(40)); //false

	}

}
