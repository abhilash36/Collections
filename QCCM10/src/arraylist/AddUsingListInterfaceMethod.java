package arraylist;

import java.util.ArrayList;

public class AddUsingListInterfaceMethod 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> ls1=new ArrayList<>();
		ls1.add(10);
		ls1.add(20);
		ls1.add(30);
		
		System.out.println("Before performing add(int,object) operation, objects in Ls1 are: "+ls1);
		
		ls1.add(1,15);
		ls1.add(3,25);

		System.out.println("After performing add(int,object) operation, objects in ls1 are: "+ls1);
	}

}
