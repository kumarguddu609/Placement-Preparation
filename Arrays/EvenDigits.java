//#1295
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int element:nums){
            if(even(element)==true){
                count++;
            }
        }
        return count;
    }

    static boolean even(int n){
        int digits=0;
        //More optimised using (int)(Math.log10(num))+1  will give no. of digits in a number
        while(n>0){
            digits++;
            n/=10;
        }
        if(digits%2==0){
            return true;
        }
        return false;
    }
}
