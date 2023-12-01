import java.util.HashMap;
import java.util.Map;

public class MostFrequentEvenElement {
    /*
    Given an integer array nums, return the most frequent even element.

If there is a tie, return the smallest one. If there is no such element, return -1.



Example 1:

Input: nums = [0,1,2,2,4,4,1]
Output: 2
Explanation:
The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
We return the smallest one, which is 2.
Example 2:

Input: nums = [4,4,4,9,2,4]
Output: 4
Explanation: 4 is the even element appears the most.
Example 3:

Input: nums = [29,47,21,41,13,37,25,7]
Output: -1
Explanation: There is no even element.
     */

    public int mostFrequentEven(int[] nums) {
        // We initialize our answer as an outrageously large odd number
        int mostFreq = 999999999;

        // this variable will determine what the highest number of occurence is
        int highestFreq = 0;

        // this map will track the occurrences of even values in nums
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            // Only if even
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);

                highestFreq = Math.max(highestFreq, map.get(num));
            }
        }

        // We iterate through the map to find only the number that appear as much as the highestFreq
        for (int num : map.keySet()) {
            if (map.get(num) == highestFreq) {
                mostFreq = Math.min(mostFreq, num);
            }
        }



        if (!(mostFreq % 2 == 0)) {
            return -1;
        }

        return mostFreq;
    }
}
