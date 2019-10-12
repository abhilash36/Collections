package treeset;

import java.util.TreeSet;

public class M1 
{
    
	public static void main(String[] args) 
	{
		TreeSet<Mobile> ts=new TreeSet<>();
		
		 ts.add(new Mobile("RedMi",10000,1));
		 ts.add(new Mobile("Samsung",16000,2));
		 ts.add(new Mobile("Moto",14000,3));
		 ts.add(new Mobile("RedMi",10000,1));
		
		System.out.println("Output is: ");
		for(Mobile i:ts)
		{
			System.out.println(i);
		}

	}

}
