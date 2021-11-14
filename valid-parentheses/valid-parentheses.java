class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            
            switch(ch) {
                case '(' :
                case '{' :
                case '[' :
                    st.push(ch);
                    break;
                case ')' :
                    if(st.empty())
                        return false;
                    else if(!st.pop().equals('('))
                        return false;
                    break;
                case '}' :
                    if(st.empty())
                        return false;
                    else if(!st.pop().equals('{'))
                        return false;
                    break;
                case ']' :
                    if(st.empty())
                        return false;
                    else if(!st.pop().equals('['))
                        return false;
                    break;
                default:
                    return false; 
                    
            }
        }
        if(st.empty()) {
           return true; 
        } else {
            return false;
        }
        
    }
}