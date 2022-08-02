class Solution {
    
    private int[] swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
    
    public void moveZeroes(int[] nums) {
        int start = 0;
        int nonZeroAt = 0;
        while(start < nums.length){
            if(nums[start] != 0){
                nums = swap(nums, start, nonZeroAt);
                nonZeroAt += 1;
            }
            start += 1;
        }
    }
}