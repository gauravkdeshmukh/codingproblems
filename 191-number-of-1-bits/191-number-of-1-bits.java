public class Solution {
    // you need to treat n as an unsigned value
    // simple counting the number of 1s in binary form
    // public int hammingWeight(int n) {
    //    String binaryStr = Integer.toBinaryString(n);
    //    int count = 0;
    //     for(int i=0; i<binaryStr.length(); i++){
    //      if(binaryStr.charAt(i) == '1')  count += 1; 
    //    } 
    //   return count;
    // }
    
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            count += 1;
            //doing a bit-wise AND of nn and n - 1 flips the least-significant 1-bit in n to 0
            //the least significant 1-bit in n always corresponds to a 0-bit in n - 1
            // anding the two numbers n and n - 1 always flips the least significant 1-bit in n to 0, and keeps all other bits the same.            
            n &= (n - 1);
        }
        return count;
    }
    
}