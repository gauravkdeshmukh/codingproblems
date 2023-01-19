public class Solution{
   public int[] intersect(int[] nums1, int[] nums2) {
        int[] temp = new int[1001];
        int[] output = new int[1001];
        int count = 0;

        for (int item : nums1)
            temp[item]++;
        for (int item : nums2) {
            if (temp[item] > 0) {
                output[count] = item;
                count++;
                temp[item] -= 1;
            }
        }
        return Arrays.copyOfRange(output, 0, count);
   }
}
