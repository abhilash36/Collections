package arraylistgetmethoditeratormethod;

import java.util.ArrayList;
import java.util.Iterator;

public class D4 
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
		    
		    //display Ramsize & hard disk size whose id is even for all laptops using get() method
		    
		    System.out.println("Hard disk & RamSize of laptop having even id is: ");
		    
		    for(int i=0;i<ls.size();i++)
		    {
		    	if(ls.get(i).id%2==0)
		    	{
		    		System.out.println("Ram Size: "+ls.get(i).ram);
		    		System.out.println("Hard Disk size is: "+ls.get(i).hard_disk);
		    	}
		    }
		    
            System.out.println("-----------------------------------------------------------");
            
           //display Ramsize & hard disk size whose id is even for all laptops using iterator() method
		    
            Iterator<Laptop> i=ls.iterator();
		    System.out.println("Hard disk & RamSize of laptop having even id is: ");
		    
		    while(i.hasNext())
		    {
		       Laptop L=i.next();
		       
		       if(L.id%2==0)
		       {
		    	   System.out.println("Ram Size is: "+L.ram);
		    	   System.out.println("Harddisk size is: "+L.hard_disk);
		       }
		    }
		    
	}

}
