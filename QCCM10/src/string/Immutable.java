package string;

public class Immutable 
{

	public static void main(String[] args) 
	{
		//String str1=new String("abc");
		//prove whether string is mutable or immutable(Answer is immutable) 
		//System.out.println(str1==str1.concat("xyz")); //false
		
		String str1="abc"; 
		String str2="abc";
		String str3="abcd";
		
		//Prove whether string pool can store duplicate objects or not
		System.out.println(str1==str2);
		
		System.out.println(str1==str3);

	}

}
