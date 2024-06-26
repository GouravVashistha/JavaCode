package DSA.Arrays;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices){
            if(price<minPrice){
                minPrice = price;
            } else if (price-minPrice>maxProfit) {
                maxProfit = price-minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = solution.maxProfit(prices);
        System.out.println("Max Profit: " + maxProfit);
    }

}
