public class PalindromeExample 
{
    public static void main(String[] args) 
    {
        String str = "madam";
        
        String strLowerCase = str.replaceAll("\\s+", "").toLowerCase();
        
        boolean isPalindrome = true;
        int left = 0;
        int right = strLowerCase.length() - 1;
        
        while (left < right) {
            if (strLowerCase.charAt(left) != strLowerCase.charAt(right)) 
            {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        
        if (isPalindrome) 
        {
            System.out.println(str + " is a palindrome.");
        } else 
        {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
