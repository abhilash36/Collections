package arraylistaccessingmethods;

import java.util.ArrayList;

public class GetMethod 
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
		
		//to turn on all the bikes using get() method
		for(int i=0;i<ls.size();i++)
		{
			ls.get(i).start();
			System.out.println("----------------------");
		}
		
		//update the bike cost to 49000 which is having cost as 50000
		for(int i=0;i<ls.size();i++)
		{
			if(ls.get(i).cost==50000)
			{
				ls.get(i).cost=49000;
				System.out.println("Bike cost updated successfully");
				System.out.println("--------------------------------");
			}
		}
		
		//to display bike details using get method after get() method
				for(int i=0;i<ls.size();i++)
				{
					System.out.println("Bike reg_no: "+ls.get(i).reg_no);
					System.out.println("Bike reg_no: "+ls.get(i).cost);
					System.out.println("Bike reg_no: "+ls.get(i).milage);
					System.out.println("---------------------------------");
					
				}
				
				//to display bike details in reverse order using get() method
				for(int i=ls.size()-1;i>=0;i--)
				{
					System.out.println("Bike reg_no: "+ls.get(i).reg_no);
					System.out.println("Bike reg_no: "+ls.get(i).cost);
					System.out.println("Bike reg_no: "+ls.get(i).milage);
					System.out.println("---------------------------------");
				}
				
		
			//Delete the bike which is having mileage as 70 using get() method
				for(int i=0;i<ls.size();i++)
				{
					if(ls.get(i).milage==70)
					{
						ls.remove(i);
						System.out.println("Bike which is having mileage as 70 removed successfully ");
					}
				}
			 
	       //to display the size of the bike 
				
					System.out.println("Total bikes present after removal is: "+ls.size()+" and they are:");
			
				
		 //to display the remaining bike details using get() method
				for(int i=0;i<ls.size();i++)
				{
					System.out.println("Bike reg_no: "+ls.get(i).reg_no);
					System.out.println("Bike cost: "+ls.get(i).cost);
					System.out.println("Bike milage: "+ls.get(i).milage);
					System.out.println("---------------------------------");
				}
	}
}
