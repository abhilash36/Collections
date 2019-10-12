package hashset;

import java.util.HashSet;

public class E2 {

	public static void main(String[] args) 
	{
		Employee e1=new Employee(1,"Abhilash");
		Employee e2=new Employee(2,"Sharath");
		
		HashSet<Employee> hs=new HashSet<>();
		hs.add(e1);
		hs.add(e2);
		
		System.out.println("Employee details are: "+hs);
		
		Employee e3=new Employee(2,"Sharath");
		System.out.println(e2==e3); //false as the reference  of different objects are different
		System.out.println(e2.equals(e3)); //true as values of both e2 & e3 are same due to override
		System.out.println(e2.hashCode()==e3.hashCode()); //true as the reference of both e2 & e3 are same due to override
		
		System.out.println("Before adding");
		System.out.println(hs.size());  //2
		
	    hs.add(e3);
		
		System.out.println("After adding");
		System.out.println(hs.size());  //2. count remains same as e3 is considered as duplicate
		

	}

}
