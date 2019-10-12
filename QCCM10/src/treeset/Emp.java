package treeset;

public class Emp implements Comparable
{
  public int compareTo(Object obj)
  {
	  if(this.salary==((Emp)obj).salary)
		  return 0;  //0 means duplicate
	  else if(this.salary>((Emp)obj).salary)
		  return 1; //directly put value next to previous value in tree set
	  else 
		  return -1; //swap value in treeset as per sorted order
  }
  
  int eid;
  double salary;
  
    Emp()
    {
    	
    }
    
    public Emp(int eid, double salary) 
    {
	   super();
	   this.eid = eid;
	   this.salary = salary;
    }
  
    public String toString()
    {
    	return "(eid: "+eid+" SSalary: "+salary+")";
    }
    
    public boolean equals(Object obj)
    {

    	return this.eid==((Emp)obj).eid && 
    		   this.salary==((Emp)obj).salary;
    }
    
    public int hashCode()
    {
    	int hc=0;
    	hc=hc+Integer.valueOf(eid).hashCode();
    	hc=hc+Double.valueOf(salary).hashCode();
    	return hc;
    }
}  
   