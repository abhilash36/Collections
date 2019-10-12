//create hashset of string type & call it as Menu1. In menu-1 add idli,dosa,palav,upma. Then print
//number of items in menu1. Create an hashset Menu-2.

package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class StringMenu 
{

	public static void main(String[] args) 
	{
		HashSet<String> menu1=new HashSet<>();
		menu1.add("idli");
		menu1.add("dosa");
		menu1.add("palav");
		menu1.add("upma");
		System.out.println("----------------------------------");
		System.out.println("Size of menu1: "+menu1.size());
		System.out.println("Items in menu1 are: "+menu1);
		
		HashSet<String> menu2=new HashSet<>();
		menu2.add("biriyani");
		menu2.add("Fried rice");
		menu2.add("palav");
		System.out.println("----------------------------------");
		System.out.println("Size of menu1: "+menu2.size());
		System.out.println("Items in menu1 are: "+menu2);
		
		
		//logic to add menu2 in menu1
		menu1.addAll(menu2);
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("After adding menu2 to menu1,number of tems in menu1 is: "+menu1.size());
		System.out.println("After adding menu2 to menu1, items in menu1 are: "+menu1);
		
		//logic to display first 3 characters in menu1 using for each loop
		System.out.println("----------------------------------------");
		System.out.println("First 3 characters of menu1 are: ");
		for(String i:menu1)
		{
			System.out.println(i.substring(0, 3));
		}
		
		
		System.out.println("----------------------------------------");
		//logic to display first 3 characters in menu2 using iterator() method
		Iterator<String> i=menu2.iterator();
		System.out.println("First 3 characters of menu2 are: ");
		while(i.hasNext())
		{
			String temp=i.next();
			System.out.println(temp.substring(0,3));
			
		}

	}

}
