package DefaultFSD;

public class Prime20
{
public static void main (String[] args)
{
    boolean isPrime = true; 
    System.out.println("The First 20 Prime Numbers are: ");

    
    // iterate over all numbers from 1 to 20
    for (int number = 1; number <= 20; number++)
    {
        // We want to believe it's a prime
        isPrime = true;
        
        // 1 is not a prime
        if (number == 1) isPrime = false;
        
        // iterate over all numbers which are lower then 'number'

        
        for (int divisor = 2; divisor < number && isPrime; divisor++) 
        {
            // if we can divide by it, it's not a prime
            if (number % divisor == 0)
            {
                isPrime = false;
            }
        }
        // print if it's a prime
        
        if (isPrime) System.out.print(number+", ");
    }
}}