import javax.swing.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 1, 2, 2};

        List<List<Integer>> answer= findDifference(nums1, nums2);

        int index = 0;

        for (List<Integer> list : answer) {
            System.out.println("List # " + index++ + ":");
            System.out.println("[ ");
            for (int num : list) {
                System.out.println(num);
            }

            System.out.println("]");
        }

    }

    public static List<List<Integer>> findDifference (int[] nums1, int[] nums2) {
        /*
            We need one parent list to hold two  children list since we are returning List<List<Integger>>
            We will also initially use sets to deal with duplicate values in either num1 or num2
         */

        List<List<Integer>> parentSolution = new ArrayList<>();

        Set<Integer> nums1Diff = new HashSet<>();

        Set<Integer> nums2Diff = new HashSet<>();


        /*
            Adding all nums1 and nums2 values to their corresponding List
         */
        for (int nums : nums1) {
            nums1Diff.add(nums);
        }

        for (int nums : nums2) {
            nums2Diff.add(nums);
        }

        // Removing values in array nums2 from nums1Diff list
        for (int i = 0; i < nums2.length; i++) {
            if (nums1Diff.contains(nums2[i])) {
                /*
                 This is important - .remove() is overloaded.
                 Attempting to remove a regular int will result in removing an index not a value.
                 We type cast the int value in nums2 to an Integer object to remove the proper value/
                 */
                nums1Diff.remove((Integer) nums2[i]);
            }
        }

        // Removing values in array nums1 from nums2Diff list
        for (int i = 0; i < nums1.length; i++) {
            if (nums2Diff.contains(nums1[i])) {
                nums2Diff.remove((Integer) nums1[i]);
            }
        }

        /*
            These are the two list we will populate and return
         */
        List<Integer> listNum1 = new ArrayList<>();
        List<Integer> listNum2 = new ArrayList<>();

        /*
            The next two loops are just adding the values of the hashsets into the list we will be returning
         */
        for (int num : nums1Diff) {
            listNum1.add(num);
        }

        for (int num : nums2Diff) {
            listNum2.add(num);
        }

        parentSolution.add(listNum1);
        parentSolution.add(listNum2);

        return parentSolution;
    }
}
