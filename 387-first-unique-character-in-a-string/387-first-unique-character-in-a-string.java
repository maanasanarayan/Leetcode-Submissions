class Solution {
    public int firstUniqChar(String s) {
        
        // Both map and set (My solution) - map for storing all unique characters and its index, set for storing the repeated characters.
        /*
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
        */
        //Only map, going over the input array twice
        
        Map<Character, Integer> count = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            if(count.containsKey(s.charAt(i))) {
                count.put(s.charAt(i), count.get(s.charAt(i)) + 1);
            } else {
                count.put(s.charAt(i), 1);
            }
        }
        
        for(int i = 0; i < s.length(); i++) {
            if(count.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}