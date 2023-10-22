import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {

    public static void main(String[] args) {
        int[] score = {10,3,8,9,4};

        String[] ranks = findRelativeRanks(score);
    }

    public static String[] findRelativeRanks(int[] score) {
        // This will hold the answer of the ranks of the score array
        String[] ranks = new String[score.length];

        // This is the sorted array of score
        Integer[] sorted = new Integer[score.length];

        for (int i = 0; i < score.length; i++) {
            sorted[i] = score[i];
        }

        // Descending order sort
        Arrays.sort(sorted, Collections.reverseOrder());

        // This map will the hold the sorted score values as keys and the rank strings as the values
        Map<Integer, String> map = new HashMap<>();

        // Placing the ranks of the sorted array into the map
        for (int i = 0; i < sorted.length; i++) {
            if (i == 0)
                map.put(sorted[i], "Gold Medal");
            else if (i == 1)
                map.put(sorted[i], "Silver Medal");
            else if (i == 2)
                map.put(sorted[i], "Bronze Medal");
            else {
                int s = i + 1;
                map.put(sorted[i], Integer.toString(s));
            }
        }

        // Populating ranks with the String values of map but the order of the score array
        for (int i = 0; i < ranks.length; i++) {
            ranks[i] = map.get(score[i]);
        }

        return ranks;
    }
}
