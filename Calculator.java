import java.util.Scanner;

public class Calculator{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int ans = 0 ;

        while(true){
            System.out.print("Enter the two digits: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println();

        System.out.print("Enter the operation wanted to perform: ");
        char op = in.next().trim().charAt(0);
        System.out.println();

        if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%')
        {
            if(op == '+')
            {
                ans = num1 + num2;
                
            }
            if(op == '-')
            {
                ans = num1 - num2;
                
            }
            if(op == '*')
            {
                ans = num1 * num2;
               
            }
            if(op == '/')
            {
                if(num1!=0){
                ans = num1 / num2;
                
                }
            }
            if(op == '%')
            {
                ans = num1 % num2;
                
            }

            else if (op == 'X' || op == 'x')
            {    
                 break;
            }
            else 
            {
                System.out.print("Enter valid input!!!");
                System.out.println();
            }
        }
         System.out.print(ans);
         System.out.println();
        }

       
        

    }
}