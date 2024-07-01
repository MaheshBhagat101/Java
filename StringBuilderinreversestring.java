public class StrReverseString {

    public static void main(String[] args) {
        String str = "Hello, world!";
        System.out.println("Original string: " + str);

        String reversed = reverseWithStringBuilder(str);
        System.out.println("Reversed string (using StringBuilder): " + reversed);
    }

    public static String reverseWithStringBuilder(String str) {
        // Create a StringBuilder object initialized with the given string
        StringBuilder sb = new StringBuilder(str);

        // Use StringBuilder's reverse() method to reverse the string
        sb.reverse();

        // Convert StringBuilder back to String and return
        return sb.toString();
    }
}