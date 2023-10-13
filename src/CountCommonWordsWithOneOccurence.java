import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountCommonWordsWithOneOccurence {

    public static void main(String[] args) {
        String[] words1 = {"leetcode","is","amazing","as","is"};
        String[] words2 = {"amazing","leetcode","is"};

        System.out.println(countWords(words1, words2));
    }

    public static int countWords(String[] words1, String[] words2) {

        int output = 0;

        // Two maps for each array to find the frequency of each word in each array
        Map<String, Integer> freq1 = new HashMap<>();
        Map<String, Integer> freq2 = new HashMap<>();

        // Using the get or default method to add the frequency of each word
        for (String word : words1) {
            freq1.put(word, freq1.getOrDefault(word, 0) + 1);
        }

        for (String word : words2) {
            freq2.put(word, freq2.getOrDefault(word, 0) + 1);
        }

        // We iterate through one of the arrays and check if the word in the array exists on the opposite map.
        // If so, we check if the occurrence is 1 for both maps.  If so, then we add to our counter
        for (int i = 0; i < words1.length;i++) {
            if (freq2.containsKey(words1[i])) {
                if (freq1.get(words1[i]) == 1 && freq2.get(words1[i]) == 1) {
                    output++;
                }
            }
        }

        return output;
    }
}
