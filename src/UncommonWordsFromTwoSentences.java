import java.util.*;

public class UncommonWordsFromTwoSentences {

    public static void main(String[] argsdasd) {
        String s1 = "apple apple";
        String s2 = "banana";

        String[] answer = uncommonFromSentences(s1, s2);

        for (String words : answer) {
            System.out.println(words);
        }

    }

    public static String[] uncommonFromSentences(String s1, String s2) {

        // This is the map that will store the occurrences of words in both strings
        Map<String, Integer> map = new HashMap();

        // Split both strings into an array where words are split into individual strings
        String[] s = (s1 + "" + s2).split(" ");

        // We add the number of occurrences (from the array including both from both strings) to a map
        for (String word : s) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // This list will hold the uncommon words hence the answer
        List<String> uncommonWords = new ArrayList<>();

        // We iterate through the map only adding to the list of uncommon words the keys with only 1 occurrence
        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                uncommonWords.add(word);
            }
        }

        // return the array equivalent of our uncommonWords list
        return uncommonWords.toArray(new String[0]);

    }

    // This was my initial solution using hashsets but having issues in edge cases with duplicate values in one of the arrays
    public static String[] uncommonFromSentences1(String s1, String s2) {

        int counter = 0;

        // I will be using a set3 here but im sure the problem could be solved with regular ole maps as well
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Set<String> finalSet = new HashSet<>();

        // Note: This is how you split words in a string by spaces:
        //String[] words = (s1 + " " + s2).split(" ");

        String[] sOne = s1.split(" ");
        String[] sTwo = s2.split(" ");

        // We will add all the words from s1 and s2 to their corresponding sets
        for (String word : sOne) {
            set1.add(word.toLowerCase());
        }

        for (String word : sTwo) {
            set2.add(word.toLowerCase());
        }

        // The next to loops will check if words in s1 or s2 are not found in the opposite set
        // If so, we will add those words to the final set since it is uncommon by definition
        for (String word : sOne) {
            if (!set2.contains(word)) {
                finalSet.add(word);
            }
        }

        for (String word : sTwo) {
            if (!set1.contains(word)) {
                finalSet.add(word);
            }
        }

        // This is the return String array and its index that we will use to populate it
        String[] answer = new String[finalSet.size()];
        int index = 0;


        for (String word : finalSet) {
            answer[index++] = word;
        }

        return answer;

    }
}
