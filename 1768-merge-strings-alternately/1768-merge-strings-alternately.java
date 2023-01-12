class Solution {
    public String mergeAlternately(String word1, String word2) {
       StringBuilder sb = new StringBuilder();
       int w1=0, w2=0, n1=word1.length(), n2=word2.length();
       while(w1 < n1 && w2 < n2){
           sb.append(word1.charAt(w1));
           sb.append(word2.charAt(w2));
           w1+=1;
           w2+=1;
       }
       if(w1 != n1){
           sb.append(word1, w1, n1);
       }
        
       if(w2 != n2){
           sb.append(word2, w2, n2);
       } 
        
       return sb.toString(); 
    }
}