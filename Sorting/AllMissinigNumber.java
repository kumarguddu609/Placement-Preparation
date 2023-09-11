//#448
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
//
//Using Extra Spaces
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        boolean[] arr = new boolean[nums.length+1];
        for(int i=0;i<arr.length;i++){
            arr[i]=false;
        }
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]=true;
        }
        for(int i=1;i<arr.length;i++){
            if(!arr[i]){
                list.add(i);
            }
        }
        return list;
    }
}
