
public class ReverseString {

    public static void main(String[] args) {
        String str = "Hello, world!";
        System.out.println("Original string: " + str);

        String reversed = reverseWithCharArray(str);
        System.out.println("Reversed string (using char array): " + reversed);
    }

    public static String reverseWithCharArray(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Initialize pointers for reversing
        int left = 0;
        int right = charArray.length - 1;

        // Swap characters from both ends towards the center
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        // Convert character array back to string
        return new String(charArray);
    }
}

