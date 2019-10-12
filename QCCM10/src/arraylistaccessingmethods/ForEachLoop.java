package arraylistaccessingmethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ForEachLoop 
{
	static ArrayList<Bike> ls=new ArrayList<>();
	
	public static void main(String[] args) 
	{
		Bike b1=new Bike("1234",45000.00,50);
		Bike b2=new Bike("5678",50000.00,60);
		Bike b3=new Bike("8997",55000.00,70);
		
		ls.add(b1);
		ls.add(b2);
		ls.add(b3);
		
		Iterator<Bike> i=ls.iterator();
		System.out.println("Below is the bike details using using Advanced-For-Loop & iterator() method");
		for(Bike j:ls)
		{
			System.out.println(j);
		}
		
		
		System.out.println("----------------------------------------------------");
		ListIterator<Bike> li=ls.listIterator(ls.size());
		System.out.println("Below is the bike details using Advanced-For-Loop & listIterator() method");
		for(Bike k:ls)
		{
			System.out.println(k);
		}

	}

}
