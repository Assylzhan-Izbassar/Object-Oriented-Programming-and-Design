package lab6;

public class Example1
{
    public static void main(String[] args)
    {
    	int denominator, numerator, ratio;

    	numerator   = 5;
    	denominator = 0;

    	try
    	{
    		//ratio = numerator / denominator;
    		System.out.print(numerator / denominator);
    	}
    	catch(ArithmeticException ar)
    	{
    		System.out.println("Divide by 0."); 
    		//ar.printStackTrace();
    	}
    	//System.out.println("The answer is: "+ ratio);

    	System.out.println("Done."); // Don't move this line
    }
}
