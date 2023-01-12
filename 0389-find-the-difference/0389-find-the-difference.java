class Solution {
    public char findTheDifference(String s, String t) {
        char x = 0;
        String str = s.concat(t);
        for(int i=0; i<str.length(); i++){
            x ^= str.charAt(i);
        }
        return x;
    }
}