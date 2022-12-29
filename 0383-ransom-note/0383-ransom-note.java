class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // magazine length is less than ransomNote
        if (magazine.length() < ransomNote.length()) return false;
        int[] map = new int[26];
        // iterate through ransomNote
        for (int i=0;i<ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            int val = magazine.indexOf(c, map[c-'a']);
            if (val == -1) return false;
            map[c-'a'] = val+1;
        }
        return true;
    }
}