class Solution {
    public boolean validMountainArray(int[] arr) {
        
        int decreasing = 0;
        
        if(arr.length < 3) {
            return false;
        }
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]) {
                return false;
            } else if(arr[i] > arr[i-1] && decreasing == 1) {
                return false;
            } else if(arr[i] < arr[i-1] && decreasing == 0) {
                if(i == 1) {
                    return false;
                }
                decreasing = 1;
            } 
        }
        
        if(decreasing == 0) {
            return false;
        }
        
        return true;
    }
}