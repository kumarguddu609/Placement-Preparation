//#1365
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
// Using Nested for loop
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            arr[i]=count;  
        }
        return arr;
    }
}

//Better Solution using bucket array
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] buck= new int[101];
        //Storing the nums[i] as the index of bucket array
        for(int i=0;i<nums.length;i++){
            buck[nums[i]] +=1;
        }
        //Adding the previous buck[j-1] to buck[j] to the number smaller or equal to 
        for(int j=1; j<101; j++){
            buck[j] += buck[j-1];
        }
        for(int k=0;k<nums.length;k++){
            int pos = nums[k];
            nums[k] = pos==0?0:buck[pos-1];
        }
        return nums;
    }
}
