//Program of adding different types(integer,string,char,boolean,double,float)  of objects to collection/array list.

package arraylist;

import java.util.ArrayList;

public class AddPrimitiveValues 
{
	public static void main(String[] args) 
	{
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add("Abhilash");
		ls.add('c');
		ls.add(true);
		ls.add(10.46);
		ls.add(16.89f);
		System.out.println("Objects present in the array list are: "+ls);

	}

}
