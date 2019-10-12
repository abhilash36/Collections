package string;

public class PrintEachWords {

	public static void main(String[] args) 
	{
	  
        String str1="  abc  xyz   uvw";
		
		char[] ch1=str1.toCharArray();
		
		int i,j;
		
		for(i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=' ')
			{
				for(j=i;j<ch1.length;j++)
				{
				  System.out.print(ch1[j]);
					
					if((j==ch1.length-1 && ch1[j]!=' ') || (ch1[j]!=' '&& ch1[j+1]==' '))
					{
						System.out.println();
				
						break;
					}
				}
				i=j;
			}
		}

	}

}

	