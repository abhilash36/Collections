package string;

public class NumberOFCharIneEachWordOfString {

	public static void main(String[] args) 
	{
        String str1="  abcd  xyz   uvwxy";
		
		char[] ch1=str1.toCharArray();
		
		int i,j,count=0;
		
		for(i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=' ')
			{
				count=0;
				
				for(j=i;j<ch1.length;j++)
				{
					System.out.print(ch1[j]);
					
					count++;
					
					if((j==ch1.length-1 && ch1[j]!=' ') || (ch1[j]!=' '&& ch1[j+1]==' '))
					{
					    System.out.println("  "+count);
						
						break;
					}
				}
				i=j;
			}
		}
	}

}
