import java.util.ArrayList;
import java.util.List;

/*
Part of the Hackerrank 1 week preparation kit.

Chat GPT provided an alternative solution which would include
simply sorting the array and then subtracting the first and last number.
The advantage to my algorithm is that it scales if the array is bigger than 5
 */
public class MiniMaxSum {
    public static void main(String[] argo){
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        miniMaxSum(arr);

    }

    public static void miniMaxSum(List<Integer> arr) {

        // We use the Integer data type to deter int overflow
        // Instanstiating an integer that will hold the largest, smallest, and sum of the array
        Integer largest = arr.get(0);
        Integer smallest = arr.get(0);

        Integer sum = 0;

        // We iterate through the array using the max and min functions to find the largest and smallest numbers
        for (int i = 0; i < arr.size(); i++) {
            largest = Math.max(largest, arr.get(i));
            smallest = Math.min(smallest, arr.get(i));

            sum += arr.get(i);
        }

        // We subtract the largest and smallest values from the total sums
        Integer maxSum = sum - smallest;
        Integer minSum = sum - largest;

        System.out.println(minSum + " " + maxSum);
    }
}
