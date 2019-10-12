package string;

public class StringLengthWithoutInbuildMethod {

	public static void main(String[] args) 
	{
		String a="abc";
		int count=0;
		
		for(int i=0;i<a.length();i++)
		{
			count++;
		}
		System.out.println("length of the string is: "+count);
	}

}
