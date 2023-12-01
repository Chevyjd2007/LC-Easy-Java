import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";

        System.out.println(isAnagram2(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (t.length() != s.length())
            return false;

        StringBuilder str = new StringBuilder(t);

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == s.charAt(i)) {
                        str.deleteCharAt(j);
                        break;
                    }

            }
        }

        return str.isEmpty();

    }

    public static boolean isAnagram2(String s, String t) {

        if (s.length() != t.length())
            return false;

        Map<Character, Integer> map = new HashMap<>();

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (map.get(c) > 1) {
                    map.put(c, map.getOrDefault(c, 0) - 1);
                } else {
                    map.remove(c);
                }
            }
        }

        return map.isEmpty();

    }

    public static boolean anotherOne(String s, String t) {

        if (s.length() != t.length())
            return false;

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);

    }



}
