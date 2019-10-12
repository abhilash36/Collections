package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class AddvalueAndDisplay 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> ls=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		
		boolean stop=false;
		
		do
		{
			System.out.println("1. Enter a number");
			System.out.println("2. Stop");
			System.out.println("Enter your choice");
			int ch=s.nextInt();
			
			
			switch(ch)
			{
			case 1:
				
			       {
				     System.out.println("Enter the number");
				     int num=s.nextInt();
				     ls.add(num);
				     System.out.println("Number added successfully");
			       }
			        break;
			
			
			case 2:
			       {
				    stop=true;
			       }
			       break;
			}
			
	     } while(!stop);
		
		System.out.println("User has entered "+ls.size()+" numbers & they are");
		System.out.println(ls);
			
	  }
}
