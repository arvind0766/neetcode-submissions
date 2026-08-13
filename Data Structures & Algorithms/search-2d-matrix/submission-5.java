class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n = matrix[0].length;
        int rowIndex=0;
        while(rowIndex<m && matrix[rowIndex][0]<=target) rowIndex++;

        rowIndex--;
        int colIndex=0;
        while(rowIndex>=0 && colIndex<n){
            if(matrix[rowIndex][colIndex]==target) return true;
            if(matrix[rowIndex][colIndex]>target) return false;
            
            colIndex++;
        }
        return false;

    }
}
