public class Ifelse{
    public static void main(String[] arg)
    {
        int salary = 25400;
        if(salary>10000){
            salary =salary+2000; // or can be written as salary += 2000
        }
        
        else{
            salary =  salary +1000;
        }

        System.out.println(salary);
    }
}