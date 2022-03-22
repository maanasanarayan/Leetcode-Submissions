class Solution {
    public int strStr(String haystack, String needle) {
//         if(needle.length() == 0) {
//             return 0;
//         }
        
//         if(!haystack.contains(needle)) {
//             return -1;
//         }
        
//         // int index = 0;
//         // int ni = 0;
//         // while(ni != needle.length() - 1) {
//         //     for(int i = index; i < haystack.length(); i++) {
//         //         if(ni == needle.length() - 1) {
//         //             return index;
//         //         } else if(needle.charAt(ni) == haystack.charAt(i)) {
//         //             ni++;
//         //             index++;
//         //         } else {
//         //             ni = 0;
//         //         }
//         //     }
//         // }
//         int index = -1;
//         int count = 0;
        
//         for(int i = 0; i < haystack.length(); i++) {
//             for(int j = 0; j < needle.length(); j++) {
//                 if(haystack.charAt(i) == needle.charAt(j) && index == -1) {
//                     index = i;
//                     count++;
//                 } else if(haystack.charAt(i) == needle.charAt(j)) {
//                     count++;
//                 } else if(haystack.charAt(i) != needle.charAt(j)) {
//                     index = -1;
//                 }
                
//                 if(count == needle.length()) {
//                     return index;
//                 }
//             }             
//         }
//         return index;
        
        if("".equals(needle)) {
            return 0;
        }
        if(!haystack.contains(needle)) {
            return -1;
        }
        if(haystack.length() == 1) {
            return 0;
        }
        
        int l = 0;
        int r = 0;
        int i = 0;
        
        while(r < haystack.length() && r - l < needle.length()) {
            if(haystack.charAt(r) == needle.charAt(i)) {
                r++;
                i++;
            } else {
                r = l + 1;
                l = r;
                i = 0;
            }
        }
        
        if(r - l == needle.length()) {
            return l;
        }
        return -1;
    }
}