class Solution {
    public int myAtoi(String s) {
        /*
        char[] chars = s.trim().toCharArray();
        List<Integer> nums = new ArrayList<>();
        int sign = 1;
        int result = 0;
        int mul = 1;
        
        for(int i = 0; i < chars.length; i++) {
            if(i == 0 && chars[0] == '-') {
                sign = -1;
                continue;
            } else if(i == 0 && chars[0] == '+') {
                continue;
            }
            
            if(chars[i] - '0' > 9) {
                break;
            } else {
                nums.add(chars[i] - '0');
            }
        }
        
        for(int i = nums.size() - 1; i >= 0; i--) {
            result += nums.get(i) * mul;
            mul *= 10;
        }
        
        if(result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return result;
        */
          int sign = 1; 
        int result = 0; 
        int index = 0;
        int n = s.length();
        
        // Discard all spaces from the beginning of the input string.
        while (index < n && s.charAt(index) == ' ') { 
            index++; 
        }
        
        // sign = +1, if it's positive number, otherwise sign = -1. 
        if (index < n && s.charAt(index) == '+') {
            sign = 1;
            index++;
        } else if (index < n && s.charAt(index) == '-') {
            sign = -1;
            index++;
        }
        
        // Traverse next digits of input and stop if it is not a digit
        while (index < n && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';

            // Check overflow and underflow conditions. 
            if ((result > Integer.MAX_VALUE / 10) || 
                (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {     
                // If integer overflowed return 2^31-1, otherwise if underflowed return -2^31.    
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            // Append current digit to the result.
            result = 10 * result + digit;
            index++;
        }
        
        // We have formed a valid number without any overflow/underflow.
        // Return it after multiplying it with its sign.
        return sign * result;
    }
}