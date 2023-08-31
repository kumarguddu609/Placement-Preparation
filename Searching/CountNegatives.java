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
//
//optimised
class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int row = rows - 1; // Start from the bottom row
        int col = 0;       // Start from the left-most column

        while (row >= 0 && col < cols) {
            if (grid[row][col] < 0) {
                count += cols - col; // All remaining elements in this row are negative
                row--; // Move to the row above
            } else {
                col++; // Move to the next column
            }
        }

        return count;
    }
}
