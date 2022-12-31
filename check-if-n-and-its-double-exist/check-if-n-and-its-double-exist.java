class Solution {
    public boolean checkIfExist(int[] arr) {
         HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i : arr) {   
            if(set.contains(i * 2) || (set.contains(i / 2) && (i % 2 == 0) )){
                return true;
            }
            else{
                set.add(i);
            }
                
        }
        
        return false;     
  }  
}