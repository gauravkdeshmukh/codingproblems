class Solution {
    public int singleNumber(int[] nums) {
//         HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
//         int singleNum = -1;
//         for(int num: nums){
//             if(!map.containsKey(num)){
//                 map.put(num, 1);
//             }else{
//                map.put(num, map.get(num)+1); 
//             }
//         }
        
//         for(Map.Entry<Integer, Integer> entry: map.entrySet()){
//             if(entry.getValue() == 1){
//                 singleNum = entry.getKey();
//             }
//         }
//         return singleNum;
        
//     }
    int a = 0;
    for (int i : nums) {
      //we can XOR all bits together to find the unique number  
      a ^= i;
    }
    return a;
  }
}