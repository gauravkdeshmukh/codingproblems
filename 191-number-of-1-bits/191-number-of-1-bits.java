public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
       String binaryStr = Integer.toBinaryString(n);
       int count = 0;
        for(int i=0; i<binaryStr.length(); i++){
         if(binaryStr.charAt(i) == '1')  count += 1; 
       } 
      return count;
    }
}