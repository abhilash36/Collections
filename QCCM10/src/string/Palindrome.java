package string;

public class Palindrome {

	public static void main(String[] args)
	{
		String s="DAD";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		if(s.equals(rev))
			System.out.println("String "+s+" is a palindrome");
		else
			System.out.println("String "+s+" is not a palindrome");

	}

}
