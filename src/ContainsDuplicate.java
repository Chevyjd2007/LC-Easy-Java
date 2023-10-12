import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {

    }

    /*
        This is my original take on this problem.
        Where I iterate twice through the array checking if numbers are the same or not.
        Issue here is the time complexity of looping through the array twice is O(n^2)
     */
    public static boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean containsDuplicate1(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num))
                return true;
             else
                set.add(num);
        }

        return false;
    }
}
