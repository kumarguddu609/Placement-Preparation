//#442
//https://leetcode.com/problems/find-all-duplicates-in-an-array/
//
//
//Using Extra Spaces
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int[] freq = new int[nums.length+1];
        for(int each : freq){
            each=0;
        }
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        //searching for twice
        for(int i=0;i<freq.length;i++){
            if(freq[i]==2)
            ans.add(i);
        }
        return ans;
    }
}
