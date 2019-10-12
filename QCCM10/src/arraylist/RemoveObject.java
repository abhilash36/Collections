package arraylist;

import java.util.ArrayList;

public class RemoveObject {

	public static void main(String[] args) 
	{
        ArrayList<Integer> ls=new ArrayList<>();
		
		ls.add(10); //index/position-0
		ls.add(30);  //index/position-1
		ls.add(50);  //index/position-2
		
		System.out.println("objects present in ls are: "+ls);
		
		ls.remove(Integer.valueOf(10));
		
		System.out.println("objects present in ls after removing value are: "+ls);

	}

}
