public class sellbuystock {
    public static void main(String[] args) {
        int[] prices = {5,1,10,5};
        int maxProfit = maxProfit(prices);
        System.out.println("Max profit: " + maxProfit);
    }
    static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        if (maxProfit>0)
        {
            System.out.println("+");
        }
        if (maxProfit<0)
        {
            System.out.println("-");
        }
        return maxProfit;
    }
}
