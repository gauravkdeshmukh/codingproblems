class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++){
           map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) +1); 
        }
        
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
			if(map.containsKey(ch) == false || map.get(ch) == 0) return false;
			else map.put(ch, map.get(ch)-1);
        }
        return true;
        
    }
}