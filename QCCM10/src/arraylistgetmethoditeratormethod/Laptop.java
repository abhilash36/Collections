package arraylistgetmethoditeratormethod;

public class Laptop 
{
  int id;
  int ram;
  int hard_disk;
  
  Laptop()
  {
	  
  }
  
  public Laptop(int id,int ram,int hard_disk)
  {
	  super();
	  this.id=id;
	  this.ram=ram;
	  this.hard_disk=hard_disk;
  }
  
  void on() 
  {
	  System.out.println("Laptop ID: "+id+ " is turned on...!!");
  }
}
