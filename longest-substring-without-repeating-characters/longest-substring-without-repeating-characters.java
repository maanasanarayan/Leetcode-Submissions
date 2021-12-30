class Solution {
    public int lengthOfLongestSubstring(String s) {
  
        if(s.length() == 0) {
            return 0;
        }
        
        Map<Character, Integer> chars = new HashMap<>();
        int[] longest = {0, 1};
        int startIndex = 0;
        char c;
        
        for(int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            
            if(chars.containsKey(c)) {
                startIndex = Math.max(startIndex, chars.get(c) + 1);
            }
            if(longest[1] - longest[0] < i + 1 - startIndex) {
                longest[0] = startIndex;
                longest[1] = i + 1;
            }
            
            chars.put(c, i);
        }
        
        return longest[1] - longest[0];
        
        /*
        // Lengthy code - Long runtime
        Map<Character, Integer> chars = new HashMap<>();
		char c;
		int startIndex = 0;
		String maxSubString = "";
		String currSubString = "";
        
        for(int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if(chars.containsKey(c)) {
				int newStartIndex = Math.max(startIndex, chars.get(c) + 1);
				if(newStartIndex != startIndex) {
					currSubString = "";
					for(int j = newStartIndex; j < i; j++) {
						currSubString += s.charAt(j);
					}					
				} 
				currSubString += s.charAt(i);
				startIndex = newStartIndex;
				chars.put(c, i);
			} else {
				chars.put(c, i);
				currSubString += c;
			}
			if(maxSubString.length() < currSubString.length()) {
				maxSubString = currSubString;
			}
		}
        
        return maxSubString.length();

        */
    }
}
