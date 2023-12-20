import java.util.Arrays;

public class BuyTwoChocolates {



    public static int buyChoco(int[] prices, int money) {

        Arrays.sort(prices);

        int n = money - prices[0] - prices[1];

        if (n >= 0)
            return n;

        return money;

    }
}
