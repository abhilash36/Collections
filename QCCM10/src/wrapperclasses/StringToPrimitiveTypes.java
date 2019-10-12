package wrapperclasses;

public class StringToPrimitiveTypes 
{
  public static void main(String[] args) 
  {
	
   String s="10";
  
   byte b=Byte.parseByte(s);
   System.out.println("Coverted value of string to primitive byte is: "+b);
   
   short S=Short.parseShort(s);
   System.out.println("Coverted value of string to primitive short is: "+S);
   
   int i=Integer.parseInt(s);
   System.out.println("Coverted value of string to primitive int is: "+i);
   
   long l=Long.parseLong(s);
   System.out.println("Coverted value of string to primitive long is: "+l);
   
   float f=Float.parseFloat(s);
   System.out.println("Coverted value of string to primitive float is: "+f);
   
   double d=Double.parseDouble(s);
   System.out.println("Coverted value of string to primitive double is: "+d);
   
   boolean bn=Boolean.parseBoolean(s);
   System.out.println("Coverted value of string to primitive boolean is: "+bn);
   
   //we cannot convert string to primitive typr character as their is no inbuilt function Character.parseCharacter();
   
  }
}
