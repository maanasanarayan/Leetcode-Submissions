class Solution {
    public int romanToInt(String s) {
        int result = 0;
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
         map.put("XL", 40);
         map.put("XC", 90);
         map.put("CD", 400);
         map.put("CM", 900);
        
        int i = 0;
        
        while(i < s.length()) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(i));
            
            if((i + 1) != s.length()) {
                String tempStr = sb.toString() + s.charAt(i+1);            
                if(map.containsKey(tempStr)) {
                    result = result + map.get(tempStr);
                    i += 2;
                }
                else {
                    result = result + map.get(sb.toString());
                    i++;
                }
            } else {
                result = result + map.get(sb.toString());
                i++;
            }
             
        }
        
        return result;
    }
}