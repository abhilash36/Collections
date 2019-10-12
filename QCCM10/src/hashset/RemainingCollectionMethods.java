package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class RemainingCollectionMethods 
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
		hs2.add(10);
		System.out.println("hs2: "+hs2);
		
		
		//searching for all the objects belongs to one collection in other collection
		System.out.println("Result is: "+hs1.containsAll(hs2));
		
		
		//To access an objects in the collection using iterator() method 
		Iterator i=hs1.iterator();
		
		System.out.println("Output using iterator() method is:");
		while(i.hasNext())
		{
		  System.out.println(i.next());	
		}
		
		
		//accessing an object using for each loop
		System.out.println("Output using for each loop is:");
		for(Object j:hs1)
		{
			System.out.println(j);
		}
		
		
		//Remove object based on index using remove(object) method
		hs1.remove(20);
		System.out.println("After removing 20 from hs1, remaining objects are: "+hs1);
		
		
		//Remove all objects of particular collection from other collection using removeAll() method
		hs2.removeAll(hs1);
		System.out.println("After removing hs1 collection from hs2, remaining onjects in hs2 are: "+hs2);
		

	}

}
