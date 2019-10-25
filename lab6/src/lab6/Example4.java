package lab6;

import java.util.*;


public class Example4
{
    public static void main(String[] args)
    {
       double leftOperand, result = 0.0, rightOperand;
       String leftString, operator, rightString;
       StringTokenizer tokenizer;
       
       Scanner in = new Scanner(System.in);

       tokenizer = new StringTokenizer(in.nextLine(), "+", true);
       StringTokenizer tokenizer1 = new StringTokenizer(in.nextLine(), "-", true);

       StringTokenizer tokenizer2 = new StringTokenizer(in.nextLine(), "*", true);
       StringTokenizer tokenizer3 = new StringTokenizer(in.nextLine(), "/", true);

       try
       {
          leftString   = tokenizer.nextToken();
          
          operator     = tokenizer.nextToken();
          operator     = tokenizer1.nextToken();
          operator     = tokenizer2.nextToken();
          operator     = tokenizer3.nextToken();
          
          rightString  = tokenizer.nextToken();

          try {
        	  
        	  leftOperand  = Double.parseDouble(leftString);
        	  rightOperand = Double.parseDouble(rightString);
        	  
        	  if (operator.equals("+"))
                  result = leftOperand + rightOperand;
               else if(operator.equals("-"))
               {
             	  result = leftOperand - rightOperand;
               }
               else if(operator.equals("*"))
               {
             	  result = leftOperand * rightOperand;
               }
               else if(operator.equals("/"))
               {
             	  try
             	  {
             		  result = leftOperand / rightOperand;
             	  }
             	  catch(ArithmeticException ae)
             	  {
             		  System.err.println("Cannot divided by zero!");
             	  }	  
               }
               else
                  result = 0.0;
              
               System.out.println("Result: " + result);
          }
          catch(NumberFormatException e)
          {
        	  System.err.println("One of the tokens is not a number");
          }
       }
       catch (NoSuchElementException nsee)
       {
          System.out.println("Invalid syntax");
       }
       catch (NumberFormatException nfe)
       {
          System.out.println("One or more operands is not a number");
       }
       
       in.close();
    }
}

