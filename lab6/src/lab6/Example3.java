package lab6;

public class Example3
{
    public static void main(String[] args)
    {
    	int i;
    	int[] data = {50, 320, 97, 12, 2000};
    	
    	int size = data.length;
    	
    	for(i=0; i < 10; i++)
    	{
    		if(i == size)
    		{
    			System.out.println("Done");
    			break;
    		}
    		System.out.println(data[i]);
    	}
    	
    }
}
