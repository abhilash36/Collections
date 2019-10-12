package treeset;

public class Mobile implements Comparable
{
	public int compareTo(Object o)
	{
		if(this.id==((Mobile)o).id)
			return 0;
		else if(this.id>((Mobile)o).id)
			return 1;
		else
			return -1;
			
	}
 	
  String name;
  double cost;
  int id;
  
  Mobile()
  {
	  
  }

  public Mobile(String name, double cost,int id) 
  {
	super();
	this.name = name;
	this.cost = cost;
	this.id=id;
  }
  
  void on()
  {
	  System.out.println(name+"is switched on");
  }
  
  public String toString()
  {
  	return "(Name: "+name+",   Cost: "+cost+",   Id: "+id+")";
  }
  
  public boolean equals(Object obj)
  {
    Mobile temp=(Mobile) obj;
  	return this.name==temp.name && 
  		   this.cost==temp.cost &&
  		   this.id==temp.id;
  }
  
  public int hashCode()
  {
  	int hc=0;
  	hc=hc+name.hashCode();
  	hc=hc+Double.valueOf(cost).hashCode();
  	hc=hc+id;
  	return hc;
  }
}
