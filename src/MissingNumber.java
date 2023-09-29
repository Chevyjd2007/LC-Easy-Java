public class MissingNumber {

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
}
