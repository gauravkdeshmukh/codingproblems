class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int r = 1; r < strs.length; r++) {
                if (strs[r].charAt(i) < strs[r-1].charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}