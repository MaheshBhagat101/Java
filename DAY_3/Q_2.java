//Write a function in java to calculate simple interest.


import java.util.Scanner;
class A 
{
    void SI(double P, double R, double T)
    {
        double simplei = (P*R*T)/100;

        System.out.println("The simple interst of the given data is: " + simplei);
    }
}

public class Q_2 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the data (principle, Rate, Time)");
        Scanner sc = new Scanner(System.in);

        System.out.println("Principle: ");
        double P = sc.nextDouble();

        System.out.println("Rate: ");
        double R = sc.nextDouble();

        System.out.println("Time: ");
        double T = sc.nextDouble();
        
        A ob = new A();
        ob.SI(P,R,T);
    }
    
}
