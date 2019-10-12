package arraylistgetmethoditeratormethod;

import java.util.ArrayList;
import java.util.ListIterator;

public class LI6 
{
	static ArrayList<Laptop> ls=new ArrayList<>();
	public static void main(String[] args) 
	{
		Laptop L1=new Laptop(1,4,500);
	    Laptop L2=new Laptop(2,8,500);
	    
	    ls.add(L1);
	    ls.add(L2);
	    
	    ls.add(new Laptop(3,4,300));
	    
	    //to display count of laptops before deleting
	    System.out.println("Total number of laptops before deleting are: "+ls.size());
	 
	  //logic to display the total number of laptops using listIterator() method
	    
	    ListIterator<Laptop> li=ls.listIterator();
	    
	    while(li.hasNext())
	    {
	    	Laptop L=li.next();
	    	
	    	if(L.hard_disk==300)
	    	{
	    		li.remove();
	    		System.out.println("Successfully removed..");
	    	}
	    }
	    //to display count of laptops after deleting
	    System.out.println("Total number of laptops after deleting are: "+ls.size()); 
	}    
}
