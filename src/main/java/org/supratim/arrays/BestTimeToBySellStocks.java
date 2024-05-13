package org.supratim.arrays;

public class BestTimeToBySellStocks {
    /*
    * Given an array prices[] of length N,
    * representing the prices of the stocks on different days,
    * the task is to find the maximum profit possible by buying and selling the stocks on different days
    * when at most one transaction is allowed.
     Note: Stock must be bought before being sold.
    * Input: prices[] = {7, 1, 5, 3, 6, 4}
    *Output: 5
    *The lowest price of the stock is on the 2nd day, i.e. price = 1. Starting from the 2nd day,
    * the highest price of the stock is witnessed on the 5th day, i.e. price = 6.
     Therefore, maximum possible profit = 6 – 1 = 5.
    *Input: prices[] = {7, 6, 4, 3, 1}
     Output: 0
     Explanation: Since the array is in decreasing order, no possible way exists to solve the problem.
    * */
    public static void main(String[] args) {
        int[] input = {77, 2, 5, 3, 6, 4};
        System.out.println("The Max profit is ::" + maxProfit(input));
    }

    public static int maxProfit(int[] input) {
        int max_profit = 0;
        int buy_price = input[0];
        for (int i = 1; i <= input.length - 1; i++) {
            if (buy_price > input[i])
                buy_price = input[i];
            if ((input[i] - buy_price) > max_profit)
                max_profit = (input[i] - buy_price);
        }
        return max_profit;
    }
}
