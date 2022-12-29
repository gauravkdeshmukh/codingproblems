class Solution {
    private int[][] maps;
    private Map<String, Integer> memo;
    
    public int minStickers(String[] words, String target) {
        memo = new HashMap<>();
        memo.put("", 0);
        
        // Build maps
        maps = new int[words.length][26];
        for (int i = 0; i < words.length; i++) {
            maps[i] = toMap(words[i]);
        }
    
        return dfs(target);
    }
    
    private int[] toMap(String word) {
        int[] dict = new int[26];
        for (char ch : word.toCharArray()) {
            dict[ch - 'a']++;
        }
        return dict;
    }
    
    private int dfs(String target) {
        if (memo.containsKey(target)) {
            return memo.get(target);
        }
        
        int min = Integer.MAX_VALUE;
        
        // Build map of target
        int[] targetMap = toMap(target);
        
        // For each word
        for (int[] map : maps) {
            if (map[target.charAt(0) - 'a'] <= 0) { // #0
                continue;
            }
            
            StringBuilder newTarget = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (targetMap[i] > 0) { // #1
                    for (int time = 0; time < Math.max(targetMap[i] - map[i], 0); time++) {
                        newTarget.append((char)('a' + i));
                    }
                }
            }
            
            int cur = dfs(newTarget.toString());
            if (cur != -1) {
                min = Math.min(cur, min);
            }
        }
        
        int result = (min == Integer.MAX_VALUE) ? -1 : 1 + min;
        memo.put(target, result);
        
        return result;
    }
}