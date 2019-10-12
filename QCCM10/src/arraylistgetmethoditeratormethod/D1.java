package arraylistgetmethoditeratormethod;

import java.util.ArrayList;
import java.util.Iterator;


public class D1 
{
    static ArrayList<Laptop> ls=new ArrayList<>();
    
	public static void main(String[] args) 
	{
		Laptop L1=new Laptop(1,4,500);
	    Laptop L2=new Laptop(2,8,300);
	    
	    ls.add(L1);
	    ls.add(L2);
	    
	    ls.add(new Laptop(3,9,500));
	    
	    
	   //logic to display the total number of laptops 
	    System.out.println("Total number of laptops are: "+ls.size());
	    
	    
	    //logic to turn on all the Laptops using get() method
	    for(int i=0;i<ls.size();i++)
	    {
	    	ls.get(i).on();
	    }

	    System.out.println("-----------------------------------");
	    
	    
	    
	   //logic to turn on all the Laptops using iterator() method
	    
        Iterator<Laptop> i=ls.iterator();
       
         
	    
	    while(i.hasNext())
	    {
	    	i.next().on();
	    }
	    
	    
	    
	}

}
