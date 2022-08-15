class Solution {
    public int strStr(String haystack, String needle) {
          if (needle.length() == 0) {
            return 0;
        }
        
        for (int i = 0; i < haystack.length(); i++) {
            char ch = haystack.charAt(i);
            char start = needle.charAt(0);
          
            if (ch == start) {
                int hayCount = i + 1;
                int needleCount = 1;
                while (hayCount < haystack.length() && needleCount < needle.length()) {
                         
            
                    if (haystack.charAt(hayCount) != needle.charAt(needleCount)) {
                        break;
                    }
                    hayCount++;
                    needleCount++;
                }
                if (needleCount == needle.length()) {
                    return i;
                }                
            }
        }
        
        return -1;
    }
}