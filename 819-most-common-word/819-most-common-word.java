class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
        Set<String> bSet = new HashSet<>(Arrays.asList(banned));
        
        String[] words = paragraph.split("\\W+");
        
        for(int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            
            if(map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else if(!bSet.contains(word)) {
                map.put(word, 1);
            }
        }
        
        int max = 0;
        String maxString = "";
        
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(max < entry.getValue()) {
                max = entry.getValue();
                maxString = entry.getKey();
            }
        }
        
        return maxString;
    }
}