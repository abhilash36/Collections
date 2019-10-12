package string;

public class PalindromeWithoutInbuiltMethod {

	public static void main(String[] args) 
	{
		String s1="MAD";
		
		char[] ch1=s1.toCharArray();
		
		char ch2[]=new char[ch1.length];
		
		for(int i=0,j=ch1.length-1;i<ch1.length;i++,j--)
		{
			ch2[j]=ch1[i];
		}
		
		String s2=String.valueOf(ch2);
		
		if(s1.equals(s2))
			System.out.println("Palindrome");
		else
			System.out.println("not palindrome");

	}

}
