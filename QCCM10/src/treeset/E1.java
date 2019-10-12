package treeset;

import java.util.TreeSet;

public class E1
    {
    	public static void main(String[] args) 
    	{
		  TreeSet s1=new TreeSet();
		  
		  s1.add(new Emp(1,100));
		  s1.add(new Emp(3,200));
		  s1.add(new Emp(2,300));
		  s1.add(new Emp(3,400));
		  s1.add(new Emp(2,300));
		  
		  
		  for(Object i:s1)
		  {
			  System.out.println(i);
			  System.out.println("---------------------------------");
		  }
		  System.out.println("Length: "+s1.size());
		}
    }
    
  


 
