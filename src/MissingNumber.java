public class MissingNumber {
    // My solution which is slightly inefficient compared to the one below
    public static int missingNumber(int[] nums) {
        int n = nums.length;


        for (int i = 0; i <= n; i++){
            Boolean counter = false;
            for (int j = 0; j < n; j++) {
                if (i == nums[j]) {
                    counter = true;
                    break;
                }
            }

            if (!counter) {
                return i;
            }
        }

        throw new IllegalArgumentException("No missing integer.");
    }

    public static int missingNumber2(int[] nums) {
        int xor = nums.length;

        for (int i = 0; i < nums.length; i++) {
            xor ^= i ^ nums[i];
        }

        return xor;
    }
}
