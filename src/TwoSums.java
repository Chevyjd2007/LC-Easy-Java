public class TwoSums {

    public static void main(String[] args) {
        int[] example = {15, 11, 7, 2};
        int target = 9;

        int[] answer = twoSums(example, target);

        for (int x : answer) {
            System.out.println(x);
        }
    }

    /* Using the brute force approach to iterate through the entire array, checking if
     * two indices add up to the target. If so, we add those indices to the output array
     */
    public static int[] twoSums(int[] arr, int target) {
        int[] output = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] + arr[j + 1] == target) {
                    output[0] = j;
                    output[1] = j + 1;
                }
            }
        }

        return output;
    }
}