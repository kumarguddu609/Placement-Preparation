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

//Using Cyclic Sort
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int correctIndex=nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                swap(nums,i,correctIndex);
            }else{
                i++;
            }
        }
        //missing numbers
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                ans.add(index+1);
            }
        }
        
        return ans;
    }
    void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
