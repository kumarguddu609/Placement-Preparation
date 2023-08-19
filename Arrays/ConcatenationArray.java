//#1929
//https://leetcode.com/problems/concatenation-of-array/
//Using Extra Space

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
           ans[i]=nums[i];
        }
        for(int i=nums.length;i<2*nums.length;i++){
           ans[i]=nums[i-nums.length];
        }
        return ans;
    }
}

//Using Advanced For loop
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*nums.length];
        int i=0;
        for(int element:nums){
           ans[i]=element;
           i++;
        }
        for(i=nums.length;i<2*nums.length;i++){
           ans[i]=nums[i-nums.length];
        }
        return ans;
    }
}
