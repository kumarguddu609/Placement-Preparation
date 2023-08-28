#54
//https://leetcode.com/problems/spiral-matrix/description/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
        List<Integer> array = new ArrayList<>();
        
        while(startRow<=endRow && startCol<=endCol){
            //Top printing
            for(int j=startCol; j<=endCol; j++){
                
                array.add(matrix[startRow][j]);

            }
            //right print
            for(int i=startRow+1; i<=endRow; i++){
                
               array.add(matrix[i][endCol]);
            }
            //bottom print
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow==endRow)
                break;
                array.add(matrix[endRow][j]);
            }
            //left Print
            for(int i=endRow-1; i>startRow; i--){
                if(startCol==endCol)
                break;
                array.add(matrix[i][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
            
        }
        return array;
    }
}
