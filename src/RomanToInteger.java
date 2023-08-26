import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.min;

public class RomanToInteger {
    public static void main(String[] args) {

        String example = "CLIV";

        int answer = romanToNumber(example);

        System.out.println(answer);
    }

    public static int romanToNumber(String s) {

        Map<Character, Integer> roman = new HashMap<>();
        // Key value pairs for roman numerals
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        // Length of String s
        int n = s.length();
        // Adding first entry from right to left
        int result = roman.get(s.charAt(n-1));

        // Can start iterating with the second to last value because of previous step.
        for (int i = n - 2; i >= 0 ; i--) {
            /* If the current i value is greater than then next i value (i + 1)
            * then add the current add value to the result.
            * If not, subtract the current i value.
             */
            if (roman.get(s.charAt(i)) >= roman.get(s.charAt(i + 1))) {
                result += roman.get(s.charAt(i));
            } else {
                result -= roman.get(s.charAt(i));
            }
        }
        return result;
    }
}