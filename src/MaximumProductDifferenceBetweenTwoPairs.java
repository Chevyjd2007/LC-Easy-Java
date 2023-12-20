import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumProductDifferenceBetweenTwoPairs {


    public static void main(String[] args) {

        int[] nums = {5,6,2,7,4};

        System.out.println(maxProductDifference2(nums));

    }

    // Quick and easy. Not the most efficient since .sort() uses quicksort which is O(nlogn)
    public int maxProductDifference(int[] nums) {

        Arrays.sort(nums);

        return (nums[nums.length - 1] * nums[nums.length - 2]) - (nums[0] * nums[1]);
    }

    public static int maxProductDifference2(int[] nums) {

        int max = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int c : nums) {
            if (c > max) {
                max2 = max;
                max = c;
            } else if (max2 < c)
                max2 = c;

            if (c < min) {
                min2 = min;
                min = c;
            } else if (c < min2)
                min2 = c;
        }


        return (max * max2) - (min * min2);
    }
}
