public class MajorityElement {
/*
Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */
    public static void main(String[] args) {

    }

    // Will be using the Boyer-Moore Voting Algo

    public int majorityElement(int[] nums) {

        // We will track our candidate and its current count
        int candidate = nums[0];
        int count = 0;

        for (int num : nums) {
            if (num == candidate) {
                count++;
            } else if (count == 0) {
                candidate = num;
                count = 1;
            } else {
                count--;
            }
        }

        // Let's verify, there's an actual candidate for good practice

        // reset count to 0
        count = 0;

        for (int num : nums) {
            if (num == candidate) {
                count++;
            }

            if (count < nums.length/2) {
                throw new IllegalArgumentException("There is no majority element");
            }
        }
        return candidate;

    }
}
