//#1672
//https://leetcode.com/problems/richest-customer-wealth/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth=Integer.MIN_VALUE;
        for(int row=0; row<accounts.length; row++){
            int wealth=0;
            for(int col=0;col<accounts[row].length;col++)
            wealth+=accounts[row][col];
            maxWealth=max(maxWealth,wealth);
        }
        return maxWealth;
    }
    int max(int a, int b){
        return (a>b)?a:b;
    }
}
