import java.util.Scanner;

public class Case{
    public static void main(String[]args)

    {
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0); //trim will reduce the extra space on in the character
                                                    // charAt(0), here 0 represents the index number of the 1st char
        if(ch >= 'a' && ch <= 'z')
        {
            System.out.println("lowercase");

        }
        else
        {
            System.out.println("uppercase");
        }
        in.close();
         


    }
    
}
