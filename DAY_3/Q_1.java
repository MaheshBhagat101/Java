//Program to Convert even number into its upper nearest odd number Switch Statement.

import java.util.Scanner;
public class Q_1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the even number to convert ");
        int number = sc.nextInt();

            if(number%2 == 0)
            {
                number++;
                System.out.println("The upper nearest odd number is " + number);
            }
            else 
            {
                System.out.println("you have entered the wrong input");
            }
        
    }
    
}
