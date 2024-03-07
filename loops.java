import java.util.Scanner;
public class loops{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); // in or input can be used
        int n = in.nextInt(); // its like scanf

        for(int i=1;i<=n;i++ ){  // for loop is used when we know how many times the loop is going to run.
            System.out.print(i);
        }
        
        
        // int num =1;
        // while(num<=5){             // while loop is used when we don't know how many times we going to run the loop
        //     System.out.println(num);
        //     num = num + 1;
        // }


        // int i= 1;
        // do{
        //     System.out.println("Hello World");
            
        // }

        // while(i!=1);


    }
}