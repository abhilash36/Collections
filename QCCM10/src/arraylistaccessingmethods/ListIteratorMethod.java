package arraylistaccessingmethods;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorMethod 
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
		
		ListIterator<Bike> li=ls.listIterator(ls.size());
		
		//to start the bike in reverse order(based on reg_no) using listIterator() method
		
		while(li.hasPrevious())
		{
			 li.previous().start();	
		}
		
		
		
		//to remove the bike from the collection whose mileage is 50 using listIterator() method
		while(li.hasNext())
		{
			Bike b=li.next();
			if(b.milage==50)
			{
			   System.out.println("---------------------------------------------");
			   li.remove();
			   System.out.println("Removed Successfully");
			   System.out.println("---------------------------------------------");
			}
		}
		//to display the count of the remaining bikes
		System.out.println("After removing,Total bike present in collection are: "+ls.size());
	
		
		//to add the bike using the listIterator() Method
		li.add(new Bike("7878",80000.00,60));
		System.out.println("----------------------------------------------------");
		
		
		//to display the count of bike after adding one bike
		System.out.println("After adding,Total bike present in collection are: "+ls.size());
		
		
		
		ListIterator<Bike> li2=ls.listIterator();
		//update the cost of bike whose reg_no is 5678 using listIterator() method
		
		while(li2.hasNext())
		{
			Bike b=li2.next();
			
			if(b.reg_no=="5678")
			{
				b.cost=90000.00;
				System.out.println("------------------------------------------");
				System.out.println("Cost Updated successfully");
			}
		}
	  }
	}

