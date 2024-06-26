public static void main(String[] args) {
    int[] prices = {7, 1, 5, 3, 6, 4};

    int maxProfit = 0;
    int minPrice = Integer.MAX_VALUE;

    for (int price : prices) {
        if (price < minPrice) {
            minPrice = price;
        }
        maxProfit = Math.max(maxProfit, price - minPrice);
    }

    System.out.println(maxProfit);
}