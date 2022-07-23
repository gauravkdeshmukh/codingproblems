class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1) return s.length();
        int longest = 0;
        for(int i=0; i < s.length(); i++){
            HashSet<Character> seenChars = new HashSet<Character>();
            for(int j=i; j < s.length(); j++){
                if(!seenChars.contains(s.charAt(j))){
                    seenChars.add(s.charAt(j));
                    longest = Math.max(longest, seenChars.size());
                }else{
                    break;
                }
            }
        }
        return longest;
        
    }
}