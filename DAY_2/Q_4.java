//java Program to check whether a year is a leap year or not. Using switch Statement.


import java.util.Scanner;

public class Q_4 
{
    public static void main(String[] args) 
    {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = Scanner.nextInt();

        int remainderby4 = year % 4;
        int remainderby100 = year % 100;
        int remainderby400 = year % 400;

        switch(remainderby4)
        {
            case 0:

            switch(remainderby100)
            {
                case 0:

                switch(remainderby400)
                {
                    case 0:
                    System.out.println(year + " is a leap year");
                    break;

                    default:
                    System.out.println(year + " is not a leap year");
                    break;
                }
                
                break;
                default:
                System.out.println(year + " is not a leap year");
                break;
                
            }
            break;
            default:
            System.out.println(year + " is not a leap year");
            break;
        }



        
    }

    
}
