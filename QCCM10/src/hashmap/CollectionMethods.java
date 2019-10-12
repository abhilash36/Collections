package hashmap;

import java.util.HashMap;

public class CollectionMethods 
{
  public static void main(String[] args) 
  {
	HashMap<Integer,Integer> hm1=new HashMap<>();
	
	//adding individual object to the collection
	hm1.put(1, 10);
	hm1.put(2, 20);
	hm1.put(3, 30);
	System.out.println("hm1: "+hm1);
	
   HashMap<Integer,Integer> hm2=new HashMap<>();
	
    //adding individual object to the collection
	hm2.put(3, 40);
	hm2.put(2, 20);
	hm2.put(4, 50);
	System.out.println("hm2: "+hm2);
	
	
	//add one collection to other collection & viewing it after adding the collection
	hm1.putAll(hm2);
    System.out.println("After adding hm2 to hm1, objects in hm1 is: "+hm1);	
	
    
    //searching for the particular object using key in the collection
	System.out.println("Output is: "+ hm1.containsKey(3));
	
	
	//searching for the object using value in the collection
	System.out.println("Output is: "+hm2.containsValue(40));
	
	//accessing the value of particular key
	System.out.println("Value of key 2 is: "+hm1.get(2));
	
	
	//try to access the value which is not present by giving the key which is not present
	System.out.println("output if the given key value not present is: "+hm2.get(5));
	
	
	//Removing of the object by using key & viewing the remaining objects in that collection
	hm1.remove(2);
	System.out.println("After removing 20 from hm1, remaining objects are: "+hm1);
	
	
	//viewing the length of the particular collection
	System.out.println("length of hm1 is: "+hm1.size());

	//verifying whether the particular collection is empty or not
	System.out.println("is hm1 is empty?"+hm1.isEmpty());

	//verifying both the collections are having same objects
	System.out.println("Is objects in both hm1 & hm2 are same? "+hm1.equals(hm2));
  }
}
