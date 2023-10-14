import java.util.ArrayList;
import java.util.List;

public class PositionsOfLargeGroups {

    public static void main(String[] args) {

        String s = "abcdddeeeeaabbbcd";

        List<List<Integer>> answer = largeGroupPositions(s);

        for (List<Integer> list : answer) {
            System.out.println("[");
            for (int i : list) {
                System.out.println(i);
            }

            System.out.println("]");
        }

    }

    // Two pointer approach
    public static List<List<Integer>> largeGroupPositions(String s) {

        List<List<Integer>> solution = new ArrayList<>();

        // pointers that will be used
        int i = 0, j = 0, n = s.length();

        /*
            We iterate through the string with this initial pointer that will keep
            track of the first index for the current consecutive character
         */
        while (i < n) {

            // This next pointer should hold the end index by iterating through String s
            // We check here the length of streak of the same characters by moving pointer j
            while (j < n && s.toCharArray()[i] == s.toCharArray()[j]) {
                j++;
            }

            // If the difference between these twp pointers (indices) is greater or equal to three,
            // We create a list between these two indices since they are a large group by definition
            if (j - i >= 3) {
                List<Integer> temp = new ArrayList<>();
                temp.add(i);

                // Bringing pointer j back down because is at the next position after the group
                j--;
                temp.add(j);

                solution.add(temp);
            }

            // We move pointer i to the current place of pointer j as we iterate
            i = j;
        }

        return solution;
    }
}
