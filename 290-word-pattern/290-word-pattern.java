class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        Map<Character,String> map = new HashMap<>();
            
        if(pattern.length() != words.length) {
            return false;
        }
        
        for(int i = 0; i < pattern.length(); i++) {
            Character ch = new Character(pattern.charAt(i));
            if(map.containsKey(ch)) {
                if(! map.get(ch).equals(words[i])) {
                    return false;
                } 
            } else {
                if(map.containsValue(words[i])) {
                    return false;
                }
                map.put(ch, words[i]);
            }
        }
        return true;
    }
}