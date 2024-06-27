//Write a function to print all prime factors of a given number. For example, if the number is 36 then your result should be 2, 2, 3, 3.

import java.util.Scanner;

public class PrimeFactors {

    
    public static void printPrimeFactors(int n)
    {
        
        while (n % 2 == 0) 
        {
            System.out.print(2 + " ");
            n /= 2;
        }

      
        for (int i = 3; i <= Math.sqrt(n); i += 2) 
        {
            
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2) 
        {
            System.out.print(n);
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its prime factors: ");
        int n = scanner.nextInt();

        System.out.print("Prime factors of " + n + ": ");
        printPrimeFactors(n);
        System.out.println();

        scanner.close();
    }
}