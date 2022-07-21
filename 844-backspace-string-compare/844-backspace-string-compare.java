class Solution {
    public boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1, j = T.length() - 1;
        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0) { // While there may be chars in build(S) or build (T)
            while (i >= 0) { // Find position of next possible char in build(S)
                if (S.charAt(i) == '#') {skipS++; i--;}
                else if (skipS > 0) {skipS--; i--;}
                else break;
            }
            while (j >= 0) { // Find position of next possible char in build(T)
                if (T.charAt(j) == '#') {skipT++; j--;}
                else if (skipT > 0) {skipT--; j--;}
                else break;
            }
            // If two actual characters are different
            if (i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j))
                return false;
            // If expecting to compare char vs nothing
            if ((i >= 0) != (j >= 0))
                return false;
            i--; j--;
        }
        return true;
    }
}

// simple stackbased solution
// import java.util.*;
// class Solution {
//     public boolean backspaceCompare(String s, String t) {
//         String stS = String.valueOf(generateStackFromString(s));
//         String stT = String.valueOf(generateStackFromString(t));
//         return stS.equals(stT);
//     }
    
//     public Stack generateStackFromString(String s){
//         Stack<Character> st = new Stack<Character>();
//         char[] chars = s.toCharArray();
//         for(int i=0; i < s.length(); i++){
//             char c = s.charAt(i);
//             if(c == '#' && !st.empty()){
//                 st.pop();
//             }else if(c != '#'){
//                st.add(c); 
//             }
//         }
//         return st;
//     }
// }

// optimized logical 2 pointer solution

