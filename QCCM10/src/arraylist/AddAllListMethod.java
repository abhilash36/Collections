package arraylist;

import java.util.ArrayList;

public class AddAllListMethod 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> ls1=new ArrayList<>();
		ls1.add(10);
		ls1.add(20);
		ls1.add(30);
		
		System.out.println("Ls1: "+ls1);
		
		ArrayList<Integer> ls2=new ArrayList<>();
		ls2.add(30);
		ls2.add(40);
		System.out.println("Ls2: "+ls2);
		
		ls1.addAll(1, ls2);
		
		System.out.println("After performing addAll(int,object) operation, objects in ls1 are: "+ls1);

	}

}
