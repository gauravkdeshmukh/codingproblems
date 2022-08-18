class Solution {
    Set<String> dict;
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        dict = new HashSet<>();
        
        for(String word : words) {
            dict.add(word);
        }
        
        List<String> output = new ArrayList<>();
        for(String word : dict) {
            if(hasMultipleWords(word, 0, word.length())) {
                output.add(word);
            }
        }
        
        
        return output;
    }
    
    private boolean hasMultipleWords(String word, int start, int end) {
        if(start == end)
            return false;
        
        if(start > 0 && dict.contains(word.substring(start, end)))
            return true;
        
        for(int i = start; i < end; i++) {
            if(dict.contains(word.substring(start, i+1))) {
                if(hasMultipleWords(word, i+1, end))
                    return true;
            }
        }
        
        return false;
    }
}