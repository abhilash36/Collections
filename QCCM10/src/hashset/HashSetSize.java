package hashset;

import java.util.HashSet;

public class HashSetSize {

	public static void main(String[] args) 
	{
		HashSet<Integer> hs1=new HashSet<>();
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		
		System.out.println("Length of hs1 are: "+hs1.size());
		
		System.out.println("Objects in hs1 are: "+hs1);

	}

}
