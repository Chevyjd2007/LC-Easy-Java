import java.util.Arrays;

public class MaximumProductDifferenceBetweenTwoPairs {


    public static void main(String[] args) {

    }

    // Quick and easy. Not the most efficient since .sort() uses quicksort which is O(nlogn)
    public int maxProductDifference(int[] nums) {

        Arrays.sort(nums);

        return (nums[nums.length - 1] * nums[nums.length - 2]) - (nums[0] * nums[1]);
    }
}
