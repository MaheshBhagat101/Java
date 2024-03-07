public class Repeatednumbers {

    //Q2. Find the number of times 8 repeated in the series 385838 ?
    public static void main(String[] args)
    {
        int n= 3858838, count=0;

        while (n>0)
        {
           int rem = n%10;
           if(rem == 8 )
           {
            count++;
           }
           n = n/10;
        }
        System.out.print(count);

      
    }
}
