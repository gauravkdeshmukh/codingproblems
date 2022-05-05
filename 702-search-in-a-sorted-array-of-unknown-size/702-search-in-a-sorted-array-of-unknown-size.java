/**
 * // This is ArrayReader's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface ArrayReader {
 *     public int get(int index) {}
 * }
 */

class Solution {
    public int search(ArrayReader reader, int target) {
       // since length is not given , Integer.MAX_VALUE needs to be defined as end
        
        int start = 0, end = Integer.MAX_VALUE;
        
        while(start <= end) {
            int mid = (start + end) / 2;
            
            if(target == reader.get(mid)) return mid;
            else if(target > reader.get(mid)) start = mid + 1;
            else end = mid - 1;
        }
        
        return -1;
    }
}