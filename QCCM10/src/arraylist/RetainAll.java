//WAP to remove the objects from ls1 that are not commonly present in ls2

package arraylist;

import java.util.ArrayList;

public class RetainAll 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer>ls3=new ArrayList<>();
		ls3.add(10);
		ls3.add(20);
		ls3.add(30);
		
		System.out.println("object of array list 3 are: "+ls3);
		
		ArrayList<Integer> ls4=new ArrayList<>();
		ls4.add(40);
		ls4.add(50);
		ls4.add(20);
		
		System.out.println("object of array list 4 are: "+ls4);
		
		ls4.retainAll(ls3);
		
		System.out.println("Objects remained in ls4 after removing un-common objects of ls3 from ls4 are: "+ls4);


	}

}
