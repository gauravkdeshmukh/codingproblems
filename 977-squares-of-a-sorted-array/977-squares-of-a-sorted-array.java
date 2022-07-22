import java.util.Arrays;

// Trivial solution using the Java Collections
// O(n log n)
// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         // calculate the squares of values in the given array
//         for(int i=0; i< nums.length; i++){
//             nums[i] = nums[i] * nums[i];
//         }
//         // sort it using the Arrays utils
//         Arrays.sort(nums);
//         return nums;
//     }
// }

// Better Approach (Optimized) - Two pointer 
// O(n)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int p1 = 0; int  p2 = nums.length - 1;
        int[] output = new int[nums.length];
        int square;
        for(int p3 = p2; p3 >= 0; p3 --){
            int productP1 = nums[p1] * nums[p1];
            int productP2 = nums[p2] * nums[p2];
            if(productP1 < productP2){
                square = productP2;
                p2 -= 1;
            }else{
                square =  productP1;
                p1 += 1;
            }
            output[p3] = square;
        }
        return output;
        }
}
