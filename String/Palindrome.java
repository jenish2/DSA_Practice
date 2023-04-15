public class Palindrome {
    static boolean isPalindrome(String S) {
        
        int start = 0;
        int end = S.length() - 1;
        while (start < end) {
            if (S.charAt(start) != S.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String palindromeString  = "abcvTTvcba";
        System.out.println(isPalindrome(palindromeString));
    }
}
