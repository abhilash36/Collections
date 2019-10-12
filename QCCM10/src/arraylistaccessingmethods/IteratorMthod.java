package arraylistaccessingmethods;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMthod 
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
		
		//to start the bike having reg_no as 1234 using iterator() method
		while(i.hasNext())
		{
			Bike k=i.next();
			if(k.reg_no=="1234")
			{
				k.start();
			}
		}
		
		
		Iterator<Bike> j=ls.iterator();
		//update the mileage of bike to 55 whose cost is greater than 50000 using iterator() method
		while(j.hasNext())
		{
		  Bike c=j.next();
		  
		  if(c.cost>50000.00)
		  {
			  c.milage=55;
			  System.out.println("Mileage updated successfully");
			  System.out.println("------------------------------------------------------------");
		  }
	//	  System.out.println("updated mileage of bike which is having cost >50k is :"+c.milage);
		}
		
	}
}
