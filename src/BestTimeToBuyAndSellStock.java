public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {2, 4, 1};

        System.out.println(maxProfit(prices));

    }

        public static int maxProfit ( int[] prices){
            int buyPrice = 999999999;
            int maxProfit = 0;

            for (int i : prices) {
                if (i < buyPrice) {
                    buyPrice = i;
                } else {
                    maxProfit = Math.max(maxProfit, i - buyPrice);
                }
            }

            return maxProfit;
        }
    }
