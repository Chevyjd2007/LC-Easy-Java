public class Largest3SameDigitNumberinString {

    public static void main(String[] args) {
        String num = "2300019";

        System.out.println(largestGoodInteger(num));
    }

    public static String largestGoodInteger(String num) {

        StringBuilder s = new StringBuilder(num.charAt(0));
        StringBuilder answer = new StringBuilder("");



        int largest = -1;

        for (int i = 1; i < num.length(); i++) {
            if (s.isEmpty()) {
                s.append(num.charAt(i));
            }

            else if (s.charAt(0) == num.charAt(i) && s.length() <= 3) {
                s.append(num.charAt(i));
            }

            else if (s.charAt(0) != num.charAt(i) && s.length() <= 3) {
                s.delete(0, 2);
            }

            else{
                System.out.println("dasdsasd");
                largest = Math.max(largest, Integer.parseInt(s.toString()));
                s.delete(0, 2);
            }
        }

        answer.append(largest);
        System.out.println(answer);

        if (largest == 0)
            return "000";

        if (largest < 0)
            return "";

        return answer.toString();

    }
}
