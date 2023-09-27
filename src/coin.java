import java.util.HashMap;
import java.util.Map;

/*
    Problem given during init prep questions seminar.
    If given an int value, find the minimum amount of coins
    to equals said int value.
 */
public class coin {
    /*
        coins = 33
        denomination = [1, 5, 10, 25]
        return  = (3, 1, 0, 1) // tuple
        def min_coin(cents)
     */

    public static void main(String[] args) {
        int coins = 100;
        int[] answer = min_coin(coins);

        for (int a : answer) {
            System.out.println(a);
        }

    }

    public static int[] min_coin(int coins) {
        int[] minCoins = new int[4];

        while (coins > 0) {
            if (coins - 25 >= 0) {
                minCoins[0] += 1;
                coins = coins - 25;
            } else if (coins - 10 >= 0) {
                minCoins[1] += 1;
                coins = coins - 10;
            } else if (coins - 5 >= 0) {
                minCoins[2] += 1;
                coins = coins - 5;
            } else if (coins - 1 >= 0) {
                minCoins[3] += 1;
                coins = coins - 1;
            }
        }

        return minCoins;

    }
}
