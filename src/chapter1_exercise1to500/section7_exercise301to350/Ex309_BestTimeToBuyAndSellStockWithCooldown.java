package chapter1_exercise1to500.section7_exercise301to350;
/*
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times) with the following restrictions:

You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
After you sell your stock, you cannot buy stock on next day. (ie, cooldown 1 day)
Example:

Input: [1,2,3,0,2]
Output: 3
Explanation: transactions = [buy, sell, cooldown, buy, sell]
* */
public class Ex309_BestTimeToBuyAndSellStockWithCooldown {
    //
    public int maxProfit(int[] prices) {
        //预处理股价数组  得到一个股价涨跌的数组
        int[]upDown=new int[prices.length];
        for(int i=1;i<prices.length;i++){
            upDown[i-1]=prices[i]-prices[i-1];
        }

        int profit=0;
        for(int i=0;i<upDown.length;i++){
            if(upDown[i]>0){
                if(i>=upDown.length-2 || upDown[i+1] >=0 || upDown[i+2]<0) {
                    profit+=upDown[i];
                }else if(){
                    profit+=
                }
            }
        }

    }
}
