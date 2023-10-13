import java.util.*;

public class UncommonWordsFromTwoSentences {

    public static void main(String[] argsdasd) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";

        String[] answer = uncommonFromSentences(s1, s2);

        for (String words : answer) {
            System.out.println(words);
        }

    }

    public static String[] uncommonFromSentences(String s1, String s2) {

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
