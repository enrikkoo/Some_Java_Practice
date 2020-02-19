public class Number26 {

    public static boolean isPalindrome(int x) {
        int oldX = x;
        int palindrome = 0;
        while ( x>0) {
            palindrome = palindrome * 10 + x % 10;
            x = x / 10;
        }

        if (oldX == palindrome) {
            return true;
        }
        else {
            return false;
        }
    }


    public static void main(String[] args) {

    }

}