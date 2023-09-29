public class FindTheDifference {

    /*
        Input: s = "abcd", t = "abcde"
        Output: "e"
        Explanation: 'e' is the letter that was added.

        Input: s = "", t = "y"
        Output: "y"

     */
    public static void main(String[] args) {

        String s = "MAGA";
        String t = "MAGTA";

        System.out.println(findTheDifference2(s, t));

    }

    // My original solution which complexity is innefficient and fails when t = {a, a}
    public static char findTheDifference(String s, String t) {

        // If s is empty, then we simply return the only possible character in t.
        if (s.isBlank()) {
            return t.charAt(0);
        }

        // We first iterate through the length of t (which will have +1 length than s)
        for (int i = 0; i < t.length(); i++) {
            // This is the boolean that will keep track of any extra char while we traverse s
            Boolean extra = false;

            // In this nested loop, we traverse through s while comparing t at the current i index.
            for (int j = 0; j < s.length(); j++) {
                // If we find char of s equalling to the current t, we return extra as true which will continue the parent loop
                if (t.charAt(i) == s.charAt(j)) {
                    extra = true;
                    break;
                }
            }

            if (!extra) {
                return t.charAt(i);
            }

        }

        throw new IllegalArgumentException("No extra character found.");
    }

    // Solution given by ChatGPT using the xor operation.
    public static char findTheDifference2(String s, String t) {

        char solution = 0;

        for (char c : s.toCharArray()) {
            solution ^= c;
        }

        for (char c : t.toCharArray()) {
            solution ^= c;
        }

        return solution;
    }
}
