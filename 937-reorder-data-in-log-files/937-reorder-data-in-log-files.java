class Solution {
    public String[] reorderLogFiles(String[] logs) {
        
        //Override compare
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String log1, String log2) {
                
                //Splitting into identifier and content
                String[] split1 = log1.split(" ", 2);
                String[] split2 = log2.split(" ", 2);
                
                //Check if digitlog
                boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
                boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
                
                if(!isDigit1 && !isDigit2) {
                    //If both are letters
                    int compVal = split1[1].compareTo(split2[1]);
                    if(compVal != 0) {
                        return compVal;
                    }
                    return split1[0].compareTo(split2[0]);
                } 
                else if(!isDigit1 && isDigit2) {
                    //If first is letter
                    return -1;
                } 
                else if(isDigit1 && !isDigit2) {
                    //If second is letter
                    return 1;
                } else {
                    //Both are digits
                    return 0;
                }
            }
        };
        
        Arrays.sort(logs, comp);
        return logs;
    }
}