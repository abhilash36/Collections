package string;

public class CountWordsInStringWithoutInbuiltfuction 
{
	public static void main(String[] args) 
	{
		String str1="  abc  xyz   uvw";
		
		char[] ch1=str1.toCharArray();
		
		int i,j,count=0;
		
		for(i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=' ')
			{
				for(j=i;j<ch1.length;j++)
				{
				
					
					if((j==ch1.length-1 && ch1[j]!=' ') || (ch1[j]!=' '&& ch1[j+1]==' '))
					{
						
						count++;
						break;
					}
				}
				i=j;
			}
		}
      System.out.println("Total number of words present are: "+count);
	}

}
