//java program which takes the length of the sides of a triangle as an input.Display whether the triangle is valid or not.

import java.util.Scanner;



public class Q_1
{
    public static boolean isValidTriangle(double side1, double side2, double side3)
    {
        return(side1+side2>side3) && (side1+side3>side2) && (side2 + side3>side1);
    }   
    
    public static void main(String[] args) 
    {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter the length of the sides of the triangle");

        System.out.println("Side 1:");
        double side1 = Scanner.nextDouble();

        System.out.println("Side 2: ");
        double side2 = Scanner.nextDouble();

        System.out.println("side 3: ");
        double side3 = Scanner.nextDouble();

        boolean isValid = isValidTriangle(side1, side2, side3);

        if (isValid)
        {
            System.out.println("Triangle with sides ("+side1+","+side2+","+side3+")is valid");
        }
        else
        {
            System.out.println("Triangle with sides ("+side1+","+side2+","+side3+")is not valid");
        }

        Scanner.close();  
    }
    
}