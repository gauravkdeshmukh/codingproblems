import java.util.*;



class Solution {
    public boolean backspaceCompare(String s, String t) {
        String stS = String.valueOf(generateStackFromString(s));
        String stT = String.valueOf(generateStackFromString(t));
        return stS.equals(stT);
    }
    
    public Stack generateStackFromString(String s){
        Stack<Character> st = new Stack<Character>();
        char[] chars = s.toCharArray();
        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '#' && !st.empty()){
                st.pop();
            }else if(c != '#'){
               st.add(c); 
            }
        }
        return st;
    }
}