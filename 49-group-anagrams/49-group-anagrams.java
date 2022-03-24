class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //Sorted keys
        /*
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        
        for(int i = 0; i < strs.length; i++) {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);
            
            if(map.containsKey(key)) 
                map.get(key).add(strs[i]);
            else 
                map.put(key, new ArrayList<>(Arrays.asList(strs[i])));
        }
        
        for(List<String> value : map.values()) {
            result.add(value);
        }
        
        return result;
        */
        
        //Character count
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        
        for(int i = 0; i < strs.length; i++) {
            int[] cnt = new int[26];
            for(int j = 0; j < strs[i].length(); j++) {
                cnt[strs[i].charAt(j) - 97]++;
            }
            String key = Arrays.toString(cnt);
            
            if(map.containsKey(key)) {
                map.get(key).add(strs[i]);
            } else {
                map.put(key, new ArrayList<>(Arrays.asList(strs[i])));
            }
        }
        
        for(List<String> value : map.values()) {
            result.add(value);
        }
        
        return result;
    }
}