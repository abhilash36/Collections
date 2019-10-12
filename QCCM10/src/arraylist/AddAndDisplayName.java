//WAP to perform multiple operations using ArrayList

package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class AddAndDisplayName 
{
  public static void main(String[] args)
  {
	  ArrayList<String> ls=new ArrayList<>();
	  
	  Scanner s=new Scanner(System.in);
	  
	  boolean stop=false;
	  
	  do
	  {
		  System.out.println("1. to add the name");
		  System.out.println("2. Search for the name");
		  System.out.println("3. Remove the name");
		  System.out.println("4. to see the number of names");
		  System.out.println("5. to see the names");
		  System.out.println("6. to exit");
		  System.out.println("Enter your choice");
		  
		  int ch=s.nextInt();
		  
		  switch(ch)
		  {
		  case 1:
		         {
			      System.out.println("Please enter your name");
			      String name=s.next();
			      ls.add(name);
			      System.out.println(name+" added successfully");
			      System.out.println("---------------------------");
		          }
		        break; 
		         
		  case 2:
		       {
			     System.out.println("Please enter the name require to search");
			     String name=s.next();
			     
			     if(ls.contains(name))
			    System.out.println(name+" is found");
			     else
			    System.out.println(name+" not found");
			     System.out.println("---------------------------");
		       }
		       break;
		       
		  case 3:
		      {
			   System.out.println("Enter the name that needs to remove");
			   String name=s.next();
			   ls.remove(name);
			   System.out.println(name+" removed successfully");
			   System.out.println("------------------------------------");
		      }
		      break;
		      
		  case 4:
		      {
			  System.out.println("count of names present in the collection ls is: "+ls.size());
			  System.out.println("--------------------------------------");
		      }
		      break;
		  
		  case 5:
			  {
			   System.out.println("Names present in the collection ls are: "+ls);
			   System.out.println("---------------------------");
		      }
			  break;
			
		  case 6:
		     {
			  stop=true; 
			  System.out.println("---------------------------");
		     }
		     break;
		  }
		  
	  }while (!stop);
	  
  }
}
