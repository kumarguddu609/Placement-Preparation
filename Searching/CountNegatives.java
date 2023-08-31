//#1351
//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
//
//Nested for loop - Brute force Approch
class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;
    }
}
