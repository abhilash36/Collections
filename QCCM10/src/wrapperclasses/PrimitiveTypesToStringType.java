package wrapperclasses;

public class PrimitiveTypesToStringType 
{
  public static void main(String[] args) 
  {
	byte b=4;
	String S1=String.valueOf(b);
	System.out.println("Value of byte in String format is: "+S1);
	
	short s=29;
	String S2=String.valueOf(s);
	System.out.println("Value of short in String format is: "+S2);
	
	int i=10;
	String S3=String.valueOf(i);
	System.out.println("Value of int in String format is: "+S3);
	
	long l=39;
	String S4=String.valueOf(l);
	System.out.println("Value of long in String format is: "+S4);
	
	float f=67.45f;
	String S5=String.valueOf(f);
	System.out.println("Value of float in String format is: "+S5);

	double d=56.89;
	String S6=String.valueOf(d);
	System.out.println("Value of double in String format is: "+S6);
	
	
	char c='a';
	String S7=String.valueOf(c);
	System.out.println("Value of char in String format is: "+S7);
	
	boolean bn=true;
	String S8=String.valueOf(bn);
	System.out.println("Value of boolean in String format is: "+S8);
  }
}
