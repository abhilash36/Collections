package arraylistgetmethoditeratormethod;
import java.util.ArrayList;
import java.util.ListIterator;

public class LI1 
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
	    
	    
	    //logic to turn on all the laptops using ListIterator() method
	    ListIterator <Laptop> li=ls.listIterator();
	    
	    while(li.hasNext())
	    {
	    	li.next().on();
	    }

	}

}
