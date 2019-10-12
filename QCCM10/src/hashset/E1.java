package hashset;

import java.util.HashSet;

public class E1 
{

	public static void main(String[] args) 
	{
		Employee e1=new Employee(1,"Abhilash");
		Employee e2=new Employee(2,"Sharath");
		
		HashSet<Employee> hs=new HashSet<>();
		hs.add(e1);
		hs.add(e2);
		
		System.out.println("Employee details are: "+hs);
		
		Employee e3=e2;
		System.out.println(e2==e3); //true bcos pointing to the same reference 
		System.out.println(e2.equals(e3)); //true bcos both e2 & e3 values are same
		System.out.println(e2.hashCode()==e3.hashCode()); //true bcos unique hashcode gets generate when we override
		
		System.out.println("Before adding");
		System.out.println(hs.size());  //2
		hs.add(e3); //adding e3 which is duplicate of e2
		System.out.println("After adding");
		System.out.println(hs.size());  //2. size remains same as it won't add duplicte values
		
		
	}

}
