package arraylist;

import java.util.ArrayList;

public class IndexOfObject 
{
  public static void main(String[] args) 
  {
	  ArrayList ls=new ArrayList();
		
		ls.add(10); //index/position-0
		ls.add(30);  //index/position-1
		ls.add(50);  //index/position-2
		
		System.out.println("objects present before deleting: "+ls);
		
		System.out.println("index of 30 is "+ls.indexOf(30));

  }
}
