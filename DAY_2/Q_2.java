//java program to input two dates from the user and then prints which of the entered dates is greater or print the same if both are equal.

import java.util.Scanner;


public class Q_2 
{
    public static void main(String[] args)
    {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter first date (day month year)");
        int day1 = Scanner.nextInt();
        int month1 = Scanner.nextInt();
        int year1 = Scanner.nextInt();

        System.out.println("Enter second date (day mont year)");
        int day2 = Scanner.nextInt();
        int month2 = Scanner.nextInt();
        int year2 = Scanner.nextInt();

        int comparison = compareDates(day1, month1, year1, day2, month2, year2);

        if(comparison > 0)
        {
            System.out.printf("First date (%d/%d/%d) is greater than second date(%d/%d/%d).\n",day1, month1, year1, day2, month2, year2);
        }
        else if(comparison < 0)
        {
            System.out.printf("Second date (%d/%d/%d) is greater than first date (%d/%d/%d).\n", day2, month2, year2, day1, month1, year1);
        }
        else 
        {
            System.out.printf("Both dates (%d/%d/%d) and (%d/%d/%d) are equal.\n", day1,month1, year1,day2,month2,year2);
        }
        Scanner.close();

        
    }

    public static int compareDates(int day1, int month1, int year1, int day2, int month2, int year2)
    {
        if(year1 > year2)
        {
            return 1;
        }
        else if (year1 < year2)
        {
            return -1;
        }
        else 
        {
            if(month1 > month2)
            {
                return 1;
            }
            else if (month1 < month2)
            {
                return -1;
            }            
            else 
            {
                if(day1 > day2)
                {
                    return 1;
                }
                else if(day1 < day2)
                {
                    return -1;
                }
                else 
                {
                    return 0;
                }
            }
        }

    }
    
}
