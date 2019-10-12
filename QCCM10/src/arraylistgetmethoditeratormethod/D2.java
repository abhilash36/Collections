package arraylistgetmethoditeratormethod;

import java.util.ArrayList;

public class D2 {

		static ArrayList<Laptop> ls=new ArrayList<>();
	    
		public static void main(String[] args) 
		{
			Laptop L1=new Laptop(1,4,500);
		    Laptop L2=new Laptop(2,8,300);
		    
		    ls.add(L1);
		    ls.add(L2);
		    
		    ls.add(new Laptop(3,9,500));
		    
		    //logic to turn on all the laptops in reverse order
		    for(int i=ls.size()-1;i>=0;i--)
		    {
		    	ls.get(i).on();
		    }
		     
  //Note: it is not possible to turn on all the laptops in reverse order using iterator() method
		  //as iterator() method wont allow to reverse in reverse order of array list.
		    
		}
}
