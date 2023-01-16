/**
 * // This is ArrayReader's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface ArrayReader {
 *     // Compares the sum of arr[l..r] with the sum of arr[x..y] 
 *     // return 1 if sum(arr[l..r]) > sum(arr[x..y])
 *     // return 0 if sum(arr[l..r]) == sum(arr[x..y])
 *     // return -1 if sum(arr[l..r]) < sum(arr[x..y])
 *     public int compareSub(int l, int r, int x, int y) {}
 *
 *     // Returns the length of the array
 *     public int length() {}
 * }
 */

class Solution {
    public int getIndex(ArrayReader rd) {
        int l = 0, r = rd.length() - 1;
        while (l < r) {
        int h = (r - l + 1) / 2; // half, h * 2 <= r - l + 1
        if (rd.compareSub(l, l + h - 1, l + h, l + h * 2 - 1) != 1)
            l = l + h;
        else
            r = l + h - 1;
        }
        return l;
    }
}