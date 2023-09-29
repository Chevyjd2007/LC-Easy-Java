public class MonotonicArray {

    public static void main(String[] args) {
        int[] nums = {1,1,0};

        System.out.println(isMonotonic(nums));
    }

    // My solution for this problem
    public static boolean isMonotonic(int[] nums) {
        if (nums.length <= 2) {
            return true;
        }

        Boolean increasing = null;
        int i = 0;

        // We iterate until two indices do not equal to each other to determine the trend (decreasing or increasing)
        while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
            i++;
        }

        //If all the numbers in the array are the same, then we return true.
        if (i == nums.length - 1) {
            return true;
        }

        //If we find indices that do not equal each other, then we determine if the array is increasing or decreasing
        if (nums[i] > nums[i + 1]) {
            increasing = false;
        } else {
            increasing = true;
        }

        // Iterate through the rest of the array with different conditions based the trend (increasing and decreasing) and we evaluate if it's not monotonic.
        for (; i < nums.length - 1; i++) {
            int j = i + 1;
            if (increasing) {
                if (nums[i] > nums[j])
                    return false;
            } else {
                if (nums[i] < nums[j])
                    return false;
            }
        }
        return true;
    }


    //ChatGPT's solution
    public static boolean isMonotonicGPT(int[] nums) {

        Boolean decreasing = true;
        Boolean increasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                decreasing = false;
            } else if (nums[i] < nums[i - 1]) {
                increasing = false;
            }
        }

        return decreasing || increasing;
    }
}
