package treeset;


import java.util.Iterator;
import java.util.TreeSet;

public class CollectionMethods 
{

	public static void main(String[] args) 
	{
	   TreeSet<Integer> hs1=new TreeSet<>();
	   
	   //adding individual object to the collection
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		
		System.out.println("hs1: "+hs1);
		
		TreeSet<Integer> hs2=new TreeSet<>();
		hs2.add(30);
		hs2.add(40);
		System.out.println("hs2: "+hs2);
		
		System.out.println("After adding hs2 in hs1, object in hs1 are: "+hs1);
		
		//add one collection to other collection
		hs1.addAll(hs2); //hs1: [10,20,30,40]
		
		//searching for the particular object in the collection
		System.out.println(hs1.contains(20)); //true
		
		//searching for all the objects belongs to one collection in other collection
		System.out.println(hs1.containsAll(hs2));  //true
		System.out.println(hs2.containsAll(hs1)); //false
		
		
		//accessing an object using for each loop
		System.out.println("Output is: ");
		for(Object k:hs1)
		{
			System.out.println(k);
		}
		
		
		//Remove object based on index using remove(object) method
		hs1.remove(40);
		System.out.println("After removing, hs1 is: "+hs1);
		
		//Remove all objects of particular collection from other collection using removeAll() method
		hs1.removeAll(hs2);
		System.out.println("After removing hs2 collection from hs1, hs1 is: "+hs1);
		
        
		//To access an objects in the collection using iterator() method 
		System.out.println("Output is: ");
		Iterator i=hs1.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
