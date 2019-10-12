package arraylist.sort;

import java.util.ArrayList;
import java.util.Collections;

public class SortReverse 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> ls=new ArrayList<>();
		ls.add(30);
		ls.add(10);
		ls.add(20);
		
		//sorting using sort() method
		Collections.sort(ls);

		System.out.println("After sorting, the order is: "+ls);

		//reversing using reverse() method
		Collections.reverse(ls);
		
		System.out.println("Reverse order of the collection ls is: "+ls);
	}

}
