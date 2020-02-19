package Practice;

public class Number121 {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i =0;i<prices.length;i++){
            for (int j =i;j<prices.length;j++){
                int profit = (prices[i]-prices[j])*(-1);
                if (profit>maxProfit){
                    maxProfit = profit;
                }
            }

        }
        return  maxProfit;

    }


    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
