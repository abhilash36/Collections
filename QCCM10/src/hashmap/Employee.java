package hashmap;

public class Employee implements Comparable <Employee>
{
	
  public int compareTo(Employee temp)
  {
	  if(this.esalary==temp.esalary)
	   return 0;
	  else if(this.esalary>temp.esalary)
		  return 1;
	  else
		  return -1;
  }
  
  
  private int eid;
  private String ename;
  private double esalary;

  
    Employee()
    {
	  
    }
    
    public Employee(int eid, String ename, double esalary) 
     {
	  super();
	  this.eid = eid;
	  this.ename = ename;
	  this.esalary = esalary;
     }
    
  
    public void work()
    {
    	System.out.println(ename+" is working...");
    }
    
    @Override
	public String toString() 
	{
		return "(eid: "+eid+" Name: "+ename+" Salary: "+esalary+")";
	}
    

	@Override
	public boolean equals(Object obj) 
	{
		Employee temp=(Employee)obj;
		return this.eid==temp.eid &&
			   this.ename==temp.ename;
	}

	@Override
	public int hashCode() 
	{
		int hc=0;
		hc=hc+eid;
		hc=hc+ename.hashCode();
		hc=hc+Double.valueOf(esalary).hashCode();
		return hc;
	}

	//accessing private members using getters & setters method
	public int getEid() 
	{
		return eid;
	}

	public void setEid(int eid) 
	{
		this.eid = eid;
	}

	public String getName() 
	{
		return ename;
	}

	public void setName(String ename) 
	{
		this.ename = ename;
	}

	public double getSalary() 
	{
		return esalary;
	}

	public void setSalary(double esalary) 
	{
		this.esalary = esalary;
	}

  
    
}
