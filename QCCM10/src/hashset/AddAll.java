package hashset;

import java.util.HashSet;

public class AddAll 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> hs1=new HashSet<>();
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		
		System.out.println("hs1: "+hs1);
		
		HashSet<Integer> hs2=new HashSet<>();
		hs2.add(20);
		hs2.add(30);
		hs2.add(40);
		System.out.println("hs2: "+hs2);
		
		hs1.addAll(hs2);  //adding hs2 in hs1
		
		System.out.println("After adding hs2 in hs1, objects in hs1 are: "+hs1);
	}

}
