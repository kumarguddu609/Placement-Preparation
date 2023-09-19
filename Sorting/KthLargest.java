//#215
//https://leetcode.com/problems/kth-largest-element-in-an-array/
//
//Using Sorting
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
