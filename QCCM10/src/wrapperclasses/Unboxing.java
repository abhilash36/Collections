package wrapperclasses;

public class Unboxing 
{

	public static void main(String[] args) 
	{
	  Byte b=6;
	  byte b1=b.byteValue();
	  System.out.println("Value after unboxing byte b is: "+b1);
	  
	  Short s=8;
	  short s1=s.shortValue();
	  System.out.println("Value after unboxing short s is: "+s1);
	  
	  Integer i=10;	
	  int i1=i.intValue();
	  System.out.println("Value after unboxing integer a is: "+i1);
	  
	  Long L=(long) 340;
	  long l1=L.longValue();
	  System.out.println("Value after unboxing Long l is: "+l1);
	  
	  
	  Float f=10.56f;
	  float f1=f.floatValue();
	  System.out.println("Value after unboxing float f is: "+f1);
	  
	  Double d=19.56;
	  double d1=d.doubleValue();
	  System.out.println("Value after unboxing double d is: "+d1);
	  
	  Character c='a';
	  char c1=c.charValue();
	  System.out.println("Value after unboxing character c is: "+c1);
	  
	  
	  Boolean bn=true;
	  boolean bn1=bn.booleanValue();
	  System.out.println("Value after unboxing boolean bn is: "+bn1);
	}

}
