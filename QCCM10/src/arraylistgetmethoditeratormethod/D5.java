//modify RamSize for all the lap-tops to 16GB if their existing RamSize is less than 16 & greater than4

package arraylistgetmethoditeratormethod;

import java.util.ArrayList;
import java.util.Iterator;

public class D5 
{
	static ArrayList<Laptop> ls=new ArrayList<>();
    
	public static void main(String[] args) 
	{
		Laptop L1=new Laptop(1,4,500);
	    Laptop L2=new Laptop(2,8,500);
	    
	    ls.add(L1);
	    ls.add(L2);
	    
	    ls.add(new Laptop(3,4,300));
	    
	    
//modify RamSize for all laptops to 16GB if their existing RamSize is less than 16 & greater than4 using get() method
	    
	    for(int i=0;i<ls.size();i++)
	    {
	    	if(ls.get(i).ram>4 && ls.get(i).ram<16)
	    	{
	    		ls.get(i).ram=16;
	    	}
	    }
	    
	    for(int i=0;i<ls.size();i++)
	    {
	    	System.out.println("ID: "+ls.get(i).id);
	    	System.out.println("RAM: "+ls.get(i).ram);
	    	System.out.println("Size: "+ls.get(i).hard_disk);
	    	System.out.println("-------------------------------------------------------------");
	    } 
	    
	    

//modify RamSize for all laptops to 16GB if their existing RamSize is less than 16 & greater than4 using iterator() method
	    
	    
	    Iterator<Laptop> i=ls.iterator();
	    
	    
	    while(i.hasNext())
	    {
	    	Laptop L=i.next();
	    	
	    	if(L.ram>4 && L.ram<16)
	    	{
	    		L.ram=16;
	    		System.out.println("Successfully modified...");
	    	}
	    System.out.println("ID: "+L.id+ " & its Ram Size is: "+L.ram);
	   }
	}
}
