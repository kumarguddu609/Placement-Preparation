//#1431
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list= new ArrayList<Boolean>();
        int maxCandies=maxOfCandies(candies);
        for(int candy:candies){
            candy+=extraCandies;
            list.add(isMaxCandies(maxCandies,candy));
        }
        return list;
    }
    int maxOfCandies(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int element:arr){
            if(max<element){
                max=element;
            }
        }
        return max;
    }
    boolean isMaxCandies(int maxCandies, int candy){
        return candy>=maxCandies?true:false;
    }
}
