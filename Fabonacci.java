import java.util.Scanner;
public class Fabonacci {
    public static void main(String[] args)
    {
        System.out.println("Enter the desired number: ");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        //0,1,1,2,3,5,8,13....
        int n1= 0, n2= 1, sum =0;

        System.out.print(n1+" "+n2);

        for(int i=2;i<=n;i++)
        {
            sum = n1 + n2 ;
            System.out.print(" "+sum);
             n1=n2;
             n2=sum;

        }



    }
}
