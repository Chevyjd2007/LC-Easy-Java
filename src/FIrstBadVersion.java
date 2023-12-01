public class FIrstBadVersion {

    public static void main(String[] args) {

        int n = 5;

        System.out.println(firstBadVersion(n));

    }

    public static int firstBadVersion(int n) {

        int a = 0;
        int b = n;

        int answer = n;

        while (a <= b) {
            int c = a + (b - a)/2;

            if (isBadVersion(c)) {
                answer = Math.min(answer, c);
                /*let's narrow things down to the left side
                  to find the lowest bad version.
                */
                b = c - 1;
            } else {
                /*
                    If mid isn't bad version, then we need to go higher.
                 */
                a = c + 1;
            }
        }

       return answer;

    }

    public static boolean isBadVersion( int input) {
        int bad = 4;
        return input >= bad;
    }
}
