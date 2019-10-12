package hashset;

import java.util.HashSet;

public class Contains 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> hs1=new HashSet<>();
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		
		System.out.println("Objects of hs1 are: "+hs1);
		System.out.println(hs1.contains(20)); //true
		System.out.println(hs1.contains(40)); //false
		

	}

}
