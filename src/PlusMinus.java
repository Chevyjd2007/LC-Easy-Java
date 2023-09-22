import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/*
Part of the Hackerrank 1 week preparation kit.

 */
class PlusMinus {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(-1);
        arr.add(-1);

        plusMinus(arr);
    }

    public static void plusMinus(List<Integer> arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        float n = arr.size();

        for (int i = 0; i < n; i++) {
            if (arr.get(i) > 0) {
                positive++;
            } else if (arr.get(i) < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        float posAnswer = positive/n;
        float negAnswer = negative/n;
        float zeroAnswer = zero/n;

        System.out.printf("%.6f%n", posAnswer);
        System.out.printf("%.6f%n", negAnswer);
        System.out.printf("%.6f%n", zeroAnswer);

    }

}