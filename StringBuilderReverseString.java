public class StringBuilderReverseString 
{

    public static void main(String[] args) {
        String str = "Hello, world!";
        System.out.println("Original string: " + str);

        String reversed = reverseWithStringBuilder(str);
        System.out.println("Reversed string (using StringBuilder): " + reversed);
    }

    public static String reverseWithStringBuilder(String str) {
        
        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        return sb.toString();
    }
}