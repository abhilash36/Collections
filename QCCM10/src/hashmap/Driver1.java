package hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Driver1 
{
		static HashMap<Integer,Employee> emp = new HashMap<>();
		
		static Scanner s=new Scanner(System.in);
		
		static Employee readEmployee()
		{
			System.out.println("Enter the employee ID");
			int eid=s.nextInt();
			
			System.out.println("Enter the employee name");
			String ename=s.next();
			
			System.out.println("Enter the employee salary");
			double esalary=s.nextDouble();
			
			if(emp.containsKey(eid))
			{
				System.out.println("Employee id already present");
				System.out.println("Enter the different employee id");
				eid=s.nextInt();
			}
			
			return new Employee(eid,ename,esalary);
		}
		
		public static void main(String[] args) 
		{
		
	      boolean stop=false;
			  
	      do
			{
		  System.out.println("=============Employee System==============");
		  System.out.println("1.To add an employee");
		  System.out.println("2. To search an employee based on Eid");
		  System.out.println("3. To count number of employees");
		  System.out.println("4. Modify employee details");
		  System.out.println("5. To remove an employee");
		  System.out.println("6. Sort in descending order of the salary");
		  System.out.println("0. To stop & exit");
		  System.out.println("Enter your choice");
		  int ch=s.nextInt();

		      switch(ch)
		      {
		        case 1:
		            {
			          Employee e=readEmployee();
			          emp.put(e.getEid(), e);
		            }
		            break;
		            
		        case 2:
		        {
		        	System.out.println("Enter an employee id to be searched");
		        	int eid=s.nextInt();
		        	
		        	if(emp.containsKey(eid))
		        	{
                      System.out.println("Eid: "+eid+" is found & respective employee details are as below");
                      System.out.println(emp.get(eid)); // to access an employee details of that particular id
		        	  System.out.println("----------------------------------------------------------------");
		        	}
                      else
                      System.out.println(eid+" is not found");
		        }
		        break;
		        
		        case 3:
		        {
		        	System.out.println("Total number of employees present are: "+emp.size());
		        	System.out.println("------------------------------------------------------");
		        }
		        break;
		        
		        
		        case 4:
		        {
		        	System.out.println("1. To modify name");
		        	System.out.println("2. To modify salary");
		        	System.out.println("Enter your choice");
		        	int c=s.nextInt();
		        	
		        	switch(c)
		        	{
		        	
		        	case 1:
		        	      {
		        	         System.out.println("Enter the id of an employee in which details has to be modified");
		        	         int id=s.nextInt();
		        	
		                 	 System.out.println("Enter new name");
		        	         String name=s.next();
		        	
		        	        if(emp.containsKey(id))
		        	         {
		        	           emp.get(id).setName(name);	
		        	           System.out.println("New name "+ name+" updated successfully");
		        	         }
		        	       else
		        	          System.out.println("Employee not found");
		        	      }
		        	      break;
		        	
		        	case 2:
		        	{
		        		System.out.println("Enter the id of an employee in which details has to be modified");
	        	         int id=s.nextInt();
	        	
	                 	 System.out.println("Enter new Salary");
	        	         String salary=s.next();
	        	         
	        	         if(emp.containsKey(id))
	        	         {
	        	           emp.get(id).setName(salary);	
	        	           System.out.println("New salary "+ salary+" updated successfully");
	        	         }
	        	       else
	        	          System.out.println("Employee not found");
		        	}
		        	break;
		          }
		        }
		        break;
		        
		        case 5:
		        {
		        	System.out.println("Enter the employee id");
		        	int id=s.nextInt();
		        	
		        	if(emp.remove(id)!=null)
		        	 System.out.println(id+" removed successfully");
		        	else
		        	 System.out.println(id + "not present to remove");
		        }
		        break;
		        
		        case 6:
		             {
		        	   ArrayList ls=new ArrayList(emp.values());  //Storing the values of employee in ArrayList
		        	   Collections.sort(ls);
		        	   Collections.reverse(ls);
		        	   
		        	   System.out.println("Salary in descing order is");
		        	   for(Object i:ls)
		        	   {
		        		   System.out.println(i);
		        		   System.out.println("--------------------------");
		        	   }
		             }
		             break;
		             
		             
		        case 0:
		        {
		        	stop=true;
		        }
		          break;
		        
		      }
		  }while(!stop);
		}

	}



