public class NumberOfGoodPairs {

    // Brute force approach. IIRC there's a dp (dynamic programming) solution.
    public int numIdenticalPairs(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j)
                    count++;
            }
        }

        return count;
    }
}
