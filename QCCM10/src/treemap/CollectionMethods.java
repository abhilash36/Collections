package treemap;

import java.util.TreeMap;

public class CollectionMethods 
{

	public static void main(String[] args) 
	{
		TreeMap<Integer,Integer> tm1=new TreeMap<>();
		
		//adding individual object to the collection
		tm1.put(1, 10);
		tm1.put(2, 20);
		tm1.put(3, 30);
		System.out.println("tm1: "+tm1);
		
	   TreeMap<Integer,Integer> tm2=new TreeMap<>();
		
	    //adding individual object to the collection
	    tm2.put(3, 40);
		tm2.put(2, 20);
		tm2.put(4, 50);
		System.out.println("tm2: "+tm2);
		
		
		//add one collection to other collection & viewing it after adding the collection
		tm1.putAll(tm2);
	    System.out.println("After adding tm2 to tm1, objects in tm1 is: "+tm1);	
		
	    
	    //searching for the particular object using key in the collection
		System.out.println("Output is: "+ tm1.containsKey(3));
		
		
		//searching for the object using value in the collection
		System.out.println("Output is: "+tm2.containsValue(40));
		
		//accessing the value of particular key
		System.out.println("Value of key 2 is: "+tm1.get(2));
		
		
		//try to access the value which is not present by giving the key which is not present
		System.out.println("output if the given key value not present is: "+tm2.get(5));
		
		
		//Removing of the object by using key & viewing the remaining objects in that collection
		tm1.remove(2);
		System.out.println("After removing 20 from tm1, remaining objects are: "+tm1);
		
		
		//viewing the length of the particular collection
		System.out.println("length of tm1 is: "+tm1.size());

		//verifying whether the particular collection is empty or not
		System.out.println("is tm1 is empty?"+tm1.isEmpty());

		//verifying both the collections are having same objects
		System.out.println("Is objects in both tm1 & tm2 are same? "+tm1.equals(tm2));
	  }
	}


	


