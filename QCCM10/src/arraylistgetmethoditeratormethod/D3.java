//Turnon only the laptop which is having the ID as 3

package arraylistgetmethoditeratormethod;

import java.util.ArrayList;
import java.util.Iterator;

public class D3 
{
	static ArrayList<Laptop> ls=new ArrayList<>();
    
	public static void main(String[] args) 
	{
		Laptop L1=new Laptop(1,4,500);
	    Laptop L2=new Laptop(2,8,300);
	    
	    ls.add(L1);
	    ls.add(L2);
	    
	    ls.add(new Laptop(3,9,500));
	    
	    //logic to display the total number of laptops using get() method
	    System.out.println("Total number of laptops are: "+ls.size());
	    
	    for(int i=0;i<ls.size();i++)
	    {
	    	if(ls.get(i).id==3)
	    	{
	    		ls.get(i).on();
	    	}
	    }
	    
	    System.out.println("-------------------------------------------------");
	    
	    
	    
	  //logic to display the total number of laptops using iterator() method
	    
	    Iterator<Laptop> i=ls.iterator();
	    
	    while(i.hasNext())
	    {
	    	Laptop l=i.next();
	    	 
	    	if(l.id==3)
	    	{
	    		l.on();
	    	}
	    }
	}
}
