import java.util.HashMap;

public class FindWordsThatCanBeFormedbyCharacters {

    public static void main(String[] args) {

        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";

        System.out.println(countCharacters(words, chars));

    }

    public static int countCharacters(String[] words, String chars) {

        int answer = 0;

        HashMap<Character, Integer> original = new HashMap<>();

        for (Character c : chars.toCharArray() ) {
            original.put(c, original.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < words.length; i++) {
            int tmp = 0;
            int a = 0;

            HashMap<Character, Integer> copy = new HashMap<>(original);

            while (a < words[i].length()) {
                if (copy.containsKey(words[i].charAt(a)) && copy.get(words[i].charAt(a)) > 0) {
                    copy.put(words[i].charAt(a), copy.getOrDefault(words[i].charAt(a), 0) - 1);
                    tmp++;
                    a++;
                } else {
                    tmp = 0;
                    break;
                }
            }

            answer += tmp;
        }

        return answer;
    }
}
