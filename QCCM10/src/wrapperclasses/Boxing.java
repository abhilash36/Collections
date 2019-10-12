package wrapperclasses;

class Boxing
{
	public static void main(String[] args) 
	{
	  int a=10;
	  char c='a';
	  float f=10.45f;
	  double d=12.56;
	  byte b=5;
	  short s=6;
	  long l=34;
	  boolean n=true;
	  
	  Integer i=Integer.valueOf(a);  //Boxing
	  Character j=Character.valueOf(c); //Boxing
	  Float f1=Float.valueOf(f);  //Boxing
	  Double d1=Double.valueOf(d);  //Boxing
	  Byte b1=Byte.valueOf(b);  //Boxing
	  Short s1=Short.valueOf(s);  //Boxing
	  Long l1=Long.valueOf(l);  //Boxing
	  Boolean n1=Boolean.valueOf(n);  //Boxing
	  
	  
	  System.out.println("Value of a (Boxing) is: "+i ); 
	  System.out.println("Value of j after boxing is: "+j);
	  System.out.println("Value of float after boxing is: "+f1);
	  System.out.println("Value of double after boxing is: "+d1);
	  System.out.println("Value of byte after boxing is: "+b1);
	  System.out.println("Value of double after boxing is: "+s1);
	  System.out.println("Value of long after boxing is: "+l1);
	  System.out.println("Value of boolean after boxing is: "+n1);
	}
}