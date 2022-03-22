class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if(m == 0) {
            return false;
        }
        int n = matrix[0].length;
        
        int left = 0;
        int right = m * n - 1;
        
        while(left <= right) {
            int mid = (left + right) / 2;
            int midEle = matrix[mid / n][mid % n];
            
            if(target == midEle) {
                return true;
            } else if(target < midEle) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}