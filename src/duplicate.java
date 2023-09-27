public class duplicate {

    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 2};

        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        int solution = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }

        return solution;
    }
}
