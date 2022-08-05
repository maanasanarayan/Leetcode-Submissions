class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int total, num1, num2;
        
        while(i >= 0 || j >= 0) {
            num1 = (i >= 0) ? (int) a.charAt(i) - '0' : 0;
            num2 = (j >= 0) ? (int) b.charAt(j) - '0' : 0;
            
            total = num1 + num2 + carry;
            sb.append(total % 2);
            carry = total / 2;
            
            i--;
            j--;
        }
        
        if(carry > 0) {
            sb.append("1");
        }
        
        return sb.reverse().toString();
    }
}