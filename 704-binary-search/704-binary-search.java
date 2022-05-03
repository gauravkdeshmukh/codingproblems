class Solution {
    public int search(int[] nums, int target) {
        if(nums==null || nums.length==0) {
            return -1;
        }
        return binarySearchHelper(nums,0,nums.length-1,target);
    }
    
    private int binarySearchHelper(int[] nums, int start,int end,int target) {
        int middle = start+(end-start)/2;
        if(start>end) {
            return -1;
        }
        if(nums[middle]==target) {
            return middle;
        } else if(nums[middle]<target) {
            return binarySearchHelper(nums,middle+1,end,target);
        } else if(nums[middle]>target) {
            return binarySearchHelper(nums,start,middle-1,target);
        } else {
            return -1;
        }
    }
}