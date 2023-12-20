import java.util.Arrays;

public class BuyTwoChocolates {



    public static int buyChoco(int[] prices, int money) {

        Arrays.sort(prices);

        int n = money - prices[0] - prices[1];

        if (n >= 0)
            return n;

        return money;

    }

    // linear complexity
    public int buyChoco2(int[] prices, int money) {

        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for (int c : prices) {
            if (c < a) {
                b = a;
                a = c;
            } else if (c < b) {
                b = c;
            }
        }

        int answer = money - (a + b);

        if (answer < 0)
            return money;

        return answer;
    }
}
