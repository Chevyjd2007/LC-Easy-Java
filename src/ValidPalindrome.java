public class ValidPalindrome {

    public static void main(String[] arg) {
        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        if (s.equals(""))
            return true;

        // two pointers
        int a = 0;
        int b = s.length() - 1;

        // My previous loop condition was "a != b" which gpt pointed out will stop prematurely if s length's is odd
        // I also had both checks of the character at either a or b being letterOrDigits as if statements not while loops.
        while (a < b) {
            while (a < b && !Character.isLetterOrDigit(s.charAt(a)))
                a++;
            while (a < b && !Character.isLetterOrDigit(s.charAt(b)))
                b--;
            if (Character.toLowerCase(s.charAt(a)) ==Character.toLowerCase(s.charAt(b))) {
                a++;
                b--;
            }
            else
                return false;


        }

        return true;

    }
}
