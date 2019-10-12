//Delete the laptop object if the harddisk size is 300 & display the remaining laptops.

package arraylistgetmethoditeratormethod;

import java.util.ArrayList;
import java.util.Iterator;

public class D6 
{
static ArrayList<Laptop> ls=new ArrayList<>();
    
	public static void main(String[] args) 
	{
		Laptop L1=new Laptop(1,4,500);
	    Laptop L2=new Laptop(2,8,500);
	    
	    ls.add(L1);
	    ls.add(L2);
	    
	    ls.add(new Laptop(3,4,300));
	    
	    //to display laptop details before deleting
	    System.out.println("Total number of laptops before deleting are: "+ls.size());
	    for(int i=0;i<ls.size();i++)
	    {
	    	System.out.println(ls.get(i).id);
	    	System.out.println(ls.get(i).ram);
	    	System.out.println(ls.get(i).hard_disk);
	    	System.out.println("------------------------------");
	    }
	    
	    //logic to remove laptop of harddisk size 300GB using get() method
	    for(int i=0;i<ls.size();i++)
	    {
	    	if(ls.get(i).hard_disk==300)
	    	{
	    		ls.remove(i);
	    		System.out.println("Successfully removed...");
	    	}
	    }
	    
	    
	    //to display the remaining lap-tops after deleting using get() method
	    
	    System.out.println("Total number of laptops after deleting are: "+ls.size());
	    System.out.println("Remaining laptop details are: ");
	    for(int i=0;i<ls.size();i++)
	    {
	    	System.out.println(ls.get(i).id);
	    	System.out.println(ls.get(i).ram);
	    	System.out.println(ls.get(i).hard_disk);
	    	System.out.println("------------------------------");
	    }
	    
	    
	    //Logic to remove lap top of hard disk size 300GB using iterator() method
	    
	    Iterator<Laptop> i=ls.iterator();
	    
	    while(i.hasNext())
	    {
	    	Laptop L=i.next();
	    	
	    	if(L.hard_disk==300)
	    	{
	    		i.remove();
	    	}
	    }
	    
	    
	  //to display the remaining lap-tops after deleting using iterator() method
	    
	    
	    while(i.hasNext())
	    {
	    	Laptop L=i.next();
	    	
	    	System.out.println("ID: "+L.id);
	    }
	}	    
}
