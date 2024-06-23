//Write a menu-driven program to design a calculator in java.

import java.util.Scanner;

public class Q_3 
{
    public static void main(String[] args)
    {
        Scanner Scanner = new Scanner(System.in);

        while (true) 
        {
            System.out.println("Menu : ");
            System.out.println("1. Addition");
            System.out.println("2. substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Select operations (1-5)");
            
            int choice = Scanner.nextInt();

            double num1, num2, result;

            switch (choice)
            {
                case 1:
                System.out.println("Enter the first number");
                num1 = Scanner.nextDouble();
                System.out.println("Enter the second number");
                num2 = Scanner.nextDouble();
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

                case 2:
                System.out.println("Enter the first number");
                num1 = Scanner.nextDouble();
                System.out.println("Enter the second number");
                num2 = Scanner.nextDouble();
                result = num1-num2;
                System.out.println("Result: " + result);
                break;

                case 3:
                System.out.println("Enter the first number");
                num1 = Scanner.nextDouble();
                System.out.println("Enter the second number");
                num2 = Scanner.nextDouble();
                result = num1*num2;
                System.out.println("Result: " + result);
                break;

                case 4:
                System.out.println("Enter the first number");
                num1 = Scanner.nextDouble();
                System.out.println("Enter the second number");
                num2 = Scanner.nextDouble();
                if(num2>0)
                {
                    result = num1/num2;
                    System.out.println("Result: " + result);
                }
                else 
                {
                    System.out.println("Invalid to divide by zero or less than it");

                }
                break;

                case 5:
                System.out.println("Exiting calculator, Goodbye!!!");
                Scanner.close();
                return;

                default:
                System.out.println("Invalid choice, please enter the digit between 1 to 5");

            }
            System.out.println();
            
        }

    }
    
}
