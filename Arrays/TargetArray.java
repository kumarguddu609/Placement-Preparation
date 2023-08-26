//#1389
//https://leetcode.com/problems/create-target-array-in-the-given-order/description/
//
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] target = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        for(int i=0;i<list.size();i++){
            target[i]=list.get(i);
        }
        return target;
    }
}
