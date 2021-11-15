class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        
        if((m * n != r * c) || (m == r && n == c)) {
            return mat;
        }
        else {
            int[] oneDArr = convertTo1D(m, n, mat);
            return convertTo2D(r, c, oneDArr);
        }
    }
    
    private static int[][] convertTo2D(int row, int col, int[] arr) {
        int[][] twoD = new int[row][col];
        int p = 0;
        
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                twoD[i][j] = arr[p++];
            }
        }
        
        return twoD;
    }
    
    private static int[] convertTo1D(int row, int col, int[][] matrix) {
        int p = 0;
        int[] oneD = new int[row * col];
        
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                oneD[p++] = matrix[i][j];
            }
        }
        
        return oneD;
    }
}