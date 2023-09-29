import java.util.ArrayList;
import java.util.List;

public class SortArrayByParity {

    public static void main(String[] args) {
        int[] nums = {3,1,2,4};

        nums = sortArrayByParity(nums);

        for (int i : nums){
            System.out.println(i);
        }
    }

    public static int[] sortArrayByParity(int[] nums){
        // We will make a new array to contain our sorted array
        int[] answer = new int[nums.length];

        // We will use two pointers to keep track of the even values at the beginning of the array and odd values at the end
        int k = 0, j = nums.length - 1;

        // We iterate through the given array while sorting even and odds as specified into the new array answer
        for (int i = 0; i < nums.length; i++) {
            // it's even
            if (nums[i] % 2 == 0) {
                answer[k++] = nums[i];
            }
            // odd
            else {
                answer[j--] = nums[i];
            }
        }

        return answer;
    }
}
