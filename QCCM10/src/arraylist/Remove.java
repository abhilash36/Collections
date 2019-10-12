package arraylist;

import java.util.ArrayList;

public class Remove 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> ls=new ArrayList<>();
		
		ls.add(10); //index/position-0
		ls.add(30);  //index/position-1
		ls.add(50);  //index/position-2
		
		System.out.println("objects present before deleting: "+ls);
		
		ls.remove(2); //need to mention the index/position of the element that needs to be deleted.
		
		System.out.println("objects present after deleting: "+ls);

	}

}
