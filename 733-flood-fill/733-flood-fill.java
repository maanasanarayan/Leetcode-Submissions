class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        dfs(image, image[sr][sc], sr, sc, newColor);
        return image;
    }
    
    private void dfs(int[][] image, int start, int currRow, int currCol, int newCol) {
        
        if(currRow < 0 || currRow >= image.length || currCol < 0 || currCol >= image[0].length || image[currRow][currCol] != start || image[currRow][currCol] == newCol) {
            return;
        }
        
        
        image[currRow][currCol] = newCol;
      
        dfs(image, start, currRow - 1, currCol, newCol);
        dfs(image, start, currRow + 1, currCol, newCol);
        dfs(image, start, currRow, currCol - 1, newCol);
        dfs(image, start, currRow, currCol + 1, newCol);
    }
}