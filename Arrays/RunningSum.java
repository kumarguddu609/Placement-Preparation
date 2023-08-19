//#1480
//https://leetcode.com/problems/running-sum-of-1d-array/
//Using Extra space

class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum[i]=sumIndex(nums,i);
        }
        return sum;
    }
    int sumIndex(int[] arr, int index){
        int sum=0;
        for(int i=0;i<=index;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
