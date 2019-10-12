//WAP to remove the objects from ls1 that are commonly present in ls2

package arraylist;

import java.util.ArrayList;

public class RemoveAll 
{
	public static void main(String[] args) 
	{
		ArrayList ls1=new ArrayList();
		ls1.add(10);
		ls1.add("Ramesh");
		ls1.add(true);
		
		System.out.println("object of array list 1 are: "+ls1);
		
		ArrayList ls2=new ArrayList();
		ls2.add(20);
		ls2.add("Suresh");
		ls2.add(true);
		
		System.out.println("object of array list 2 are: "+ls2);
		
		ls1.removeAll(ls2);
		
		System.out.println("Objects remained in ls1 after removing common objects of ls2 from ls1 are: ");
		
		System.out.println(ls1);

	}

}
