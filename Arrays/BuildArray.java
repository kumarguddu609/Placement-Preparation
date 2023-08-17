//#1920
//https://leetcode.com/problems/build-array-from-permutation/
//Using extra space
class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}

//Using Advanced for loop
class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans=new int[nums.length];
        int i=0; 
        for(int element:nums){  
            ans[i]=nums[element];
            i++;
        }
        return ans;
    }
}
