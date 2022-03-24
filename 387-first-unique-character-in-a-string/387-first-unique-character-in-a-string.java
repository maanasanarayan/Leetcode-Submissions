class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> repeated = new HashSet<>();
        
        for(int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            
            if(!map.containsKey(ch) && !repeated.contains(ch)) {
                map.put(ch, i);
            } else {
                map.remove(ch);
                repeated.add(ch);
            }
        }
        
        if(map.size() == 0) {
            return -1;
        }
        
        int min = s.length() - 1;        
        for(Integer val : map.values()) {
            if(min > val) {
                min = val;
            }
        }
        
        return min;
    }
}