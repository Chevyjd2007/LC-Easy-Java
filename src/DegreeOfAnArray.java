import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DegreeOfAnArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1, 4, 2};
        System.out.println(findShortestSubArray(nums));
    }

    public static int findShortestSubArray(int[] nums) {

        HashSet set = new HashSet();
        Map<Integer, Integer> map = new HashMap<>();
        int degree = 0;
        int  degreeNumber = 0;

        int firstIndex = 0;
        int lastIndex = 0;


        int m = 0;

        for (int num : nums) {
            if (set.contains(num))
                map.put(num, map.getOrDefault(num, 0) + 1);
            else
                set.add(num);
        }

        for (int j = 0; j < map.size(); j++) {
            if (map.containsKey(nums[j])) {
                m = nums[j];
                if (degree < map.get(m)) {
                    degree = map.get(m);
                    degreeNumber = nums[j];
                }
            }
        }

        for (int q = 0; q < nums.length; q++) {
            if (nums[q] == degreeNumber) {
                firstIndex = q;
                break;
            }
        }

        for (int w = nums.length - 1; w > 0; w--) {
            if (nums[w] == degreeNumber) {
                lastIndex = w;
                break;
            }
        }

        return Math.abs(firstIndex - lastIndex) + 1;



    }
}
