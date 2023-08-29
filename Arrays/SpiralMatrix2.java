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
