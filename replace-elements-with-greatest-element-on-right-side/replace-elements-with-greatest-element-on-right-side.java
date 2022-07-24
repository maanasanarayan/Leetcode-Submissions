class Solution {
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length-1];
        arr[arr.length - 1] = -1;
        
        int i = arr.length - 2;
        int temp;
        
        while(i >= 0) {
            temp = arr[i];
            arr[i] = max;
            if(temp > max) max = temp;
            i--;
        }
        
        return arr;
    }
}