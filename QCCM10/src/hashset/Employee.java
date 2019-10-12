package hashset;

public class Employee 
{
 int eid;
 String name;
 
 public Employee()
 {
	 
 }

   public Employee(int eid, String name) 
    {
	 super();
	 this.eid = eid;
	 this.name = name;
    }
 
   void work()
   {
	   System.out.println(name+" is working..!!!");
   }
   
   public String toString()
   {
	   return "(Eid: "+eid+" ,Name: "+name+")"; 
   }
   
   public boolean equals(Object obj)
   {
	   Employee temp=(Employee) obj;
	   return this.eid==temp.eid &&
			   this.name==temp.name;
   }
   
   public int hashCode()
   {
	   int hc=0;
	   hc=hc+eid;
	   hc=hc+name.hashCode();
	   return hc;
   }
 
}
