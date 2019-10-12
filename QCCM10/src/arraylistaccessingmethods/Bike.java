package arraylistaccessingmethods;

public class Bike 
{
  String reg_no;
  double cost;
  int milage;
  
  Bike()
  {
	  
  }
  
  Bike(String reg_no,double cost,int milage)
  {
	  this.reg_no=reg_no;
	  this.cost=cost;
	  this.milage=milage;
  }
  
  void start()
  {
	  System.out.println("Bike "+reg_no+" gets started");
  }
  
  public String toString()
	{
		return "Reg_no is: "+reg_no+"   Cost is: "+cost+"  Mileage is: "+milage;
	}
}
