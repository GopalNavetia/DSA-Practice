public class _10_Best_Time_to_Buy_and_Sell_Stock{

    public static int buySellStock(int prices[]){
        int buyPrice=prices[0];
        int maxProfit=0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i]>buyPrice) {
                maxProfit= Math.max(maxProfit, prices[i]-buyPrice);
            } else{
                buyPrice=prices[i];
            }
        }

        return maxProfit;
    }
    public static void main(String[] args){
        int prices[]={7,1,5,3,6,4};

        System.out.println(buySellStock(prices));
    }
}