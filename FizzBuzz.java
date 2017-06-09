/* @ptam1

Iterates through the numbers 1 to 100. Prints Fizz if the number is a multiple of 3. 
Prints Buzz if the number is a multiple of 5.
Prints FizzBuzz if the number is a multiple of 3 and 5. */




public class FizzBuzz
{
  public static void main(String[] args)
  {
      int number = 0;
      
      for(int a = 0; a <=100; a++)
      {
       
        if((number % 3) == 0)
        {
          System.out.println("Fizz");
          number++;
        }
        else if((number % 5) == 0)
        { 
          System.out.println("Buzz");
          number++;
        }
        else if (((number % 3) == 0) && (number % 5)==0)
        {
          System.out.println("FizzBuzz");
         number++;
        }
        else
        {
          System.out.println(number);
          number++;
        }
      }
    }
  }

        