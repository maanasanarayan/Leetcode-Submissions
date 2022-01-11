class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int high = numbers.length - 1;
         int[] res = new int[2];
        
        while(i < numbers.length - 1) {
            int low = i + 1;
            int rem = target - numbers[i];
            
            while(low <= high) {
                int mid = low + (high - low) / 2;
                
                if(numbers[mid] == rem) {
                    res[0] = i + 1;
                    res[1] = mid + 1;
                    break;
                }
                else if(numbers[mid] < rem) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
            i++;
        }
        
        return res;
        
    }
}