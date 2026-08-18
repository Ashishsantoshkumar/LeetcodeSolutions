class Solution {
    public double minPrice(int[] prices, int[] discounts) {

        Arrays.sort(prices);
        Arrays.sort(discounts);
        double minNo = Double.MAX_VALUE;

        double ans = 0;
        int a = prices.length - 1, b = discounts.length - 1;
        while (a >= 0 && b >= 0) {
            double x = ((prices[a] * (100 - discounts[b])) / 100.0);
            ans += x;
            a--;
            b--;

        }
        while (a >= 0) {
            ans += prices[a--];
        }
        minNo = Math.min(minNo, ans);
        return minNo;

    }
}