package com.leetcode;

/*
 *   1672. Richest Customer Wealth
 *
 *   Problem Statement - A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
 *
 * */

public class RichestCustomerWealth {
    public static void main(String[] args) {

        int [][] accounts = {{1,5},{7,3,4},{3,5}};
        System.out.println(richestCustomerWealth(accounts));

    }

    static int richestCustomerWealth(int [][] accounts){
        int maxWealth = Integer.MIN_VALUE;

        for (int customer = 0; customer < accounts.length; customer++){
            int rowSum = 0;
            for (int bank = 0; bank < accounts[customer].length; bank++){
                rowSum += accounts[customer][bank];
            }

            if (rowSum > maxWealth){
                maxWealth = rowSum;
            }
        }

        return maxWealth;
    }
}
