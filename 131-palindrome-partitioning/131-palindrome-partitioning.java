class Solution {
    public List<List<String>> partition(String s) {        
        List<List<String>> result = new ArrayList<List<String>>();
        List<String> part = new ArrayList<String>();
        
        dfs(0, result, part, s);
        
        return result;
    }
    
    private void dfs(int i, List<List<String>> result, List<String> part, String s) {
        if(i >= s.length()) {
            result.add(new ArrayList<String>(part));
            return;
        }
        
        for(int j = i; j < s.length(); j++) {
            if(isPalindrome(s, i, j)) {
                part.add(s.substring(i, j+1));
                dfs(j+1, result, part, s);
                part.remove(part.size() - 1);
            }
        }
    }
    
    private boolean isPalindrome(String s, int i, int j) {
        while(i <= j) {
            if(!(s.charAt(i) == s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}