public class ReverseVowelsOfAString {

    public static void main(String[] sadd) {
        String s = "leetcode";

        System.out.println(reverseVowels(s));
    }



    public static String reverseVowels(String s) {

        // Two pointers
        int a = 0;
        int b = s.length() - 1;

        StringBuilder str = new StringBuilder(s);

        while (a < b) {
            while ((a < b) && (!isVowel(s.charAt(a)))) {
                a++;
            }

            while ((a < b) && (!isVowel(s.charAt(b)))) {
                b--;
            }

            if (isVowel((s.charAt(a))) && isVowel(s.charAt(b))){
                char tmp = s.charAt(b);
                str.setCharAt(b, s.charAt(a));
                str.setCharAt(a, tmp);
                a++;
                b--;

            }

        }

        return str.toString();
    }

    public static boolean isVowel(char c) {
        char j = Character.toLowerCase(c);
        return j == 'a' || j == 'e' || j == 'i' || j == 'o' || j == 'u';
    }

    }

