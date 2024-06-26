//Write a function to calculate the factorial of a number.

import java.util.Scanner;

public class Q_1
{
    public static long factorial(int n) 
    {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        
        int number = scanner.nextInt();
        
        long factorialOfNumber = factorial(number);
        
        System.out.println("Factorial of " + number + " is: " + factorialOfNumber);
        
        scanner.close(); 
    }

}
