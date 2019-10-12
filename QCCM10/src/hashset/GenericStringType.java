package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class GenericStringType 
{
	public static void main(String[] args) 
	{
		HashSet<String> hs1=new HashSet<>();
		hs1.add("hello");
		hs1.add("bye");
		hs1.add("hello");
		hs1.add("good");
		hs1.add("bad");
		System.out.println("Output is: "+hs1);
		System.out.println("Length of the hashset is:"+hs1.size());
		System.out.println("----------------------------------------------");
		hs1.remove("bye");
		System.out.println("Output after the hashset hs1 after removing bye is: "+hs1);
		System.out.println("Updated Size of hashset hs1 is: "+hs1.size());
	//	System.out.println("----------------------------------------------");
		
		Iterator<String> i=hs1.iterator();
		System.out.println("----------------------------------------------");
		System.out.println("Length of string ");
		while(i.hasNext())
		{
			String temp=i.next();
			System.out.println(temp+" is: "+temp.length());
		}
		
		System.out.println("--------------------------------");
		System.out.println("Output using advanced for loop is: ");
		for(String j:hs1)
		{
			System.out.println(j);
		}

	}
}

