package string;

import java.util.Scanner;

public class GetCharOfStringVtoutInbuilt {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String str1=s1.next();
		
		System.out.println("Enter the index position");
		
		int i=s1.nextInt();
		
		char ch[]=str1.toCharArray();
	
		System.out.println("Character pesent at given index is :"+ch[i]);
		

	}

}
