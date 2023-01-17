class Solution {
    
    private int binarySearch(int[] nums, int high, int low, int target){
        if(high < low) return -1;
        int mid = low + (high - low) / 2;
        if(nums[mid] == target) return mid;
        if(nums[mid] > target) return binarySearch(nums, mid-1, low, target);
        else return binarySearch(nums, high, mid+1, target);
        }
    
    
    public int search(int[] nums, int target) {
        return binarySearch(nums, nums.length - 1, 0, target);
    }
}