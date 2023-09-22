/*
Part of the Hackerrank 1 week preparation kit.
 */
public class TimeConversion {
    public static void main(String[] args) {
        String s = "12:40:03AM";

        String answer = timeConversion(s);
        System.out.println(answer);
    }


    public static String timeConversion(String s) {
        /*
            m will be an integer of the first two character of s.
            On cases where it's PM, we will add 12 to M to find the
            military time of s.
         */
        int m = Integer.parseInt(s.substring(0, 2));
        // This is the string that will contain the solution depending on if AM or PM
        String solution = s.substring(2, s.length() - 2);

        /*
            We will check if the string s contains am or pm.
            Then in either case we will check if m (the first two character of s) is 12:

            If it is 12, then in AM we will change the first two characters to 00 for the conversion.
            If it's not 12 and PM, then we will add 12 to the first two characters for the conversion.
         */
        if (s.contains("AM")){
            if (m == 12) {
                return solution = "00" + solution;
            }
            else {
                return solution = s.substring(0, s.length() - 2);
            }
        } else {
            if (m == 12)
                return solution = m + solution;
             else {
                m = m + 12;
                return solution = m + solution;
            }
        }

        }

    }

