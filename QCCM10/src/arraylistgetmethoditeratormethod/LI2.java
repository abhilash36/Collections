package arraylistgetmethoditeratormethod;

import java.util.ArrayList;
import java.util.ListIterator;

public class LI2 
{
	static ArrayList<Laptop> ls=new ArrayList<>();
    
	public static void main(String[] args) 
	{
		Laptop L1=new Laptop(1,4,500);
	    Laptop L2=new Laptop(2,8,300);
	    
	    ls.add(L1);
	    ls.add(L2);
	    
	    ls.add(new Laptop(3,9,500));
	    
	  //logic to turn on all the laptops in reverse order using ListIterator()
	    
	    ListIterator<Laptop> li=ls.listIterator(ls.size());
	    
	    while(li.hasPrevious())
	    {
	    	li.previous().on();
	    }
	}
}
