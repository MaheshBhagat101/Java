import java.util.Scanner;
public class Reverseno{
    public static void main(String[] args)
    {
        System.out.print("Enter the number to be reversed: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
       
         int reverse = 0;

        while(number!=0)
        {
             int rem = number % 10; 
             reverse = reverse*10 + rem ;
             number = number/10;

        }
         
         System.out.print("The reverse of the given number is "+reverse  );

    }
}