// O(n^2) Brute force solution
//     public int lengthOfLongestSubstring(String s) {
//         if(s.length() <= 1) return s.length();
//         int longest = 0;
//         for(int i=0; i < s.length(); i++){
//             HashSet<Character> seenChars = new HashSet<Character>();
//             for(int j=i; j < s.length(); j++){
//                 if(!seenChars.contains(s.charAt(j))){
//                     seenChars.add(s.charAt(j));
//                     longest = Math.max(longest, seenChars.size());
//                 }else{
//                     break;
//                 }
//             }
//         }
//         return longest;
        
//     }
// }

// O(n) Optimized solution using Sliding window technique
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         if(s.length() <= 1) return s.length();
//         HashMap<Character,Integer> map = new HashMap<Character,Integer>();
//         int left=0; int longest = 0;
//         for (int right = 0; right < s.length(); right++) {
//             if (map.containsKey(s.charAt(right))) {
//                 left = Math.max(map.get(s.charAt(right)), left);
//             }
//             longest = Math.max(longest, right - left + 1);
//             map.put(s.charAt(right), right + 1);
//         }
//         return longest;
//     }
// }

// O(n) solution with sliding window 2 pointer with cache 
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length();
        
        int start = 0;
        int end = 0;
        int str[] = new int[128];
        int max = 0;
        
        while(end < n) {
            char curr = s.charAt(end);
            str[curr]++;
            
            while( str[curr] > 1) {
                str[s.charAt(start)]--;
                start++;
            }
            max = Math.max(max, end - start + 1);
            end++;
        }
        
        return max;
    }
}