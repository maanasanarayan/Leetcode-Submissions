class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        
        for(int i = 0; i < words.length; i++) {
            char[] word = words[i].toCharArray();
            int low = 0;
            int high = word.length - 1;
            
            while(low < high) {
                char temp = word[low];
                word[low++] = word[high];
                word[high--] = temp;
            }
            
            words[i] = new String(word);
        }
        return String.join(" ", words);
    }
}