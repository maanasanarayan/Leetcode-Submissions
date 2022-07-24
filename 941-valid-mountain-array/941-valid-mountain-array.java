class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length == 1) {
            return false;
        }
        
        boolean dec = false, start = true;
        
        for(int i = 1; i < arr.length; i++) {
            if(start) {
                if(arr[i] <= arr[i-1]) {
                    return false;
                }
                start = false;
            } else if(dec) {
                if(arr[i] >= arr[i-1]) {
                    return false;
                }
            } else if(! dec) {
                if(arr[i] < arr[i-1]) {
                    dec = true;
                } else if(arr[i] == arr[i-1]) {
                    return false;
                }
            }
        }
        
        if(! dec) {
            return false;
        }
        return true;
    }
}