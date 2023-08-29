//#59
//
class Solution {
    public int[][] generateMatrix(int n) {
        int startRow=0;
        int startCol=0;
        int endRow=n-1;
        int endCol=n-1;
        int[][] matrix= new int[n][n];
        int count=1;
        
        while(startRow<=endRow && startCol<=endCol){
            //Top printing
            for(int j=startCol; j<=endCol; j++){
                
                matrix[startRow][j]=count++;

            }
            //right print
            for(int i=startRow+1; i<=endRow; i++){
                
               matrix[i][endCol]=count++;
            }
            //bottom print
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow==endRow)
                break;
                matrix[endRow][j]=count++;
            }
            //left Print
            for(int i=endRow-1; i>startRow; i--){
                if(startCol==endCol)
                break;
               matrix[i][startCol]=count++;
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
            
        }
        return matrix;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int left = 0, right = n - 1, top = 0, bottom = n - 1;

        while (num <= n * n) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // Traverse from right to left (if necessary)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }

            // Traverse from bottom to top (if necessary)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }
        return matrix;
    }
}

