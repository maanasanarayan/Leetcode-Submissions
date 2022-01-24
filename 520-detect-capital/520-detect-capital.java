class Solution {
    public boolean detectCapitalUse(String word) {
        int lowerCase = 0;
        int upperCase = 0;
        
        for(int i = 0; i < word.length(); i++) {
            Character ch = new Character(word.charAt(i));
            if(Character.isLowerCase(ch)) {
                if(upperCase != 0) {
                    return false;
                }
                lowerCase = 1;
            } else if(Character.isUpperCase(ch)) {
                if(lowerCase == 1) {
                    return false;
                } else if(i != 0) {
                    upperCase = 1;
                }
            }
        }
        return true;
    }
}
                     